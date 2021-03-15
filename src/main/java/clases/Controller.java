package clases;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Label label;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;

	public void initialize() {
		// TODO
	}

	@FXML
	private void plus(ActionEvent event) throws IOException {
		double num1I = Double.parseDouble(num1.getText());
		double num2I = Double.parseDouble(num2.getText());
		Calculadora c = new Calculadora();
		double resul = c.sumar(num1I, num2I);
		label.setText(resul + "");

	}

	@FXML
	private void restar(ActionEvent event) throws IOException {
		double num1I = Double.parseDouble(num1.getText());
		double num2I = Double.parseDouble(num2.getText());
		Calculadora c = new Calculadora();
		double resul = c.restar(num1I, num2I);
		label.setText(resul + "");
	}

	@FXML
	private void mul(ActionEvent event) throws IOException {
		double num1I = Double.parseDouble(num1.getText());
		double num2I = Double.parseDouble(num2.getText());
		Calculadora c = new Calculadora();
		double resul = c.multiplicar(num1I, num2I);
		label.setText(resul + "");
	}

	@FXML
	private void div(ActionEvent event) throws IOException {
		double num1I = Double.parseDouble(num1.getText());
		double num2I = Double.parseDouble(num2.getText());
		Calculadora c = new Calculadora();
		double resul = c.dividir(num1I, num2I);
		label.setText(resul + "");
	}
}
