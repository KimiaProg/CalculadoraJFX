package clases;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {

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
		boolean valido = true;
		double num1D = 0, num2D = 0;
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

				// Calculando la operacion con la ayuda de la clase Calculadora
				if (valido) {
					labelError.setText("");
					Calculadora c = new Calculadora();
					double resul = c.sumar(num1D, num2D);
					resulOp.setText(resul + "");
				}
			}
		} else {
			labelError.setText("Error: Debes introducir dos números!!");
		}
	}

	@FXML
	private void restar(ActionEvent event) throws IOException {
		boolean valido = true;
		double num1D = 0, num2D = 0;
		if (num1.getText() != null && num2.getText() != null) {
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

				if (valido) {
					labelError.setText("");
					Calculadora c = new Calculadora();
					double resul = c.restar(num1D, num2D);
					resulOp.setText(resul + "");
				}
			}
		} else {
			labelError.setText("Error: Debes introducir dos números!!");
		}
	}

	@FXML
	private void mul(ActionEvent event) throws IOException {
		boolean valido = true;
		double num1D = 0, num2D = 0;
		if (num1.getText() != null && num2.getText() != null) {
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

				if (valido) {
					labelError.setText("");
					Calculadora c = new Calculadora();
					double resul = c.multiplicar(num1D, num2D);
					resulOp.setText(resul + "");
				}
			}
		} else {
			labelError.setText("Error: Debes introducir dos números!!");
		}
	}

	@FXML
	private void div(ActionEvent event) throws IOException {
		boolean valido = true;
		double num1D = 0, num2D = 0;
		if (num1.getText() != null && num2.getText() != null) {
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

				if (valido) {
					labelError.setText("");
					Calculadora c = new Calculadora();
					double resul = c.dividir(num1D, num2D);
					resulOp.setText(resul + "");
				}
			}
		} else {
			labelError.setText("Error: Debes introducir dos números!!");
		}
	}
}
