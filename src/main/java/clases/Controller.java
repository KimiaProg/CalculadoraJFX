package clases;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	private double num1D = 0, num2D = 0;

	@FXML
	private TextField resulOp;
	@FXML
	private Label labelError;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;

	public void initialize() {
		// TODO
	}

	@FXML
	private void plus(ActionEvent event) throws IOException {

		// Si los números introducido son validos calculamos la operacion con la ayuda
		// de la clase Calculadora
		if (validacionConversionNum()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double resul = c.sumar(num1D, num2D);
			resulOp.setText(resul + "");
		}

	}

	@FXML
	private void restar(ActionEvent event) throws IOException {

		if (validacionConversionNum()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double resul = c.restar(num1D, num2D);
			resulOp.setText(resul + "");
		}

	}

	@FXML
	private void mul(ActionEvent event) throws IOException {

		if (validacionConversionNum()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double resul = c.multiplicar(num1D, num2D);
			resulOp.setText(resul + "");
		}

	}

	@FXML
	private void div(ActionEvent event) throws IOException {

		if (validacionConversionNum()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double resul = c.dividir(num1D, num2D);
			resulOp.setText(resul + "");
		}

	}

	/**
	 * Este método convierte los strings obtenidos de los textFiedls y los convierte
	 * en double y controla los errores posibles a la hora de conversion.
	 * 
	 * @return
	 * @throws IOException
	 */
	private boolean validacionConversionNum() throws IOException {
		boolean valido = true;
		// Asegurandonos que se introduce algo en el textField
		if (num1.getText() != null && num2.getText() != null) {
			// Asegurandonos que se introduce un numero en el textField
			try {
				num1D = Double.parseDouble(num1.getText());
				valido = true;
			} catch (NumberFormatException e) {
				labelError.setText("Error: Debes introducir dos números!!");
				valido = false;
			}
			if (valido) {
				try {
					num2D = Double.parseDouble(num2.getText());
					valido = true;
				} catch (NumberFormatException e) {
					labelError.setText("Error: Debes introducir dos números!!");
					valido = false;
				}
			}
		} else {
			labelError.setText("Error: Debes introducir dos números!!");
		}

		return valido;

	}

}
