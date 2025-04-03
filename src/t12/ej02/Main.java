package t12.ej02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	TextField nombre ;
	Text panelSaludo ;
	Button boton ;
 
	private void accion() {
	}
	
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane(2, 1);

		panelSaludo.setFont(Font.font("Verdana", 20));
		boton.setFont(Font.font("Verdana", 20));

		grid.add(nombre, 0, 0);
		grid.add(panelSaludo, 0, 1);
		grid.add(boton, 0, 2);

		Scene s = new Scene(grid);
		primaryStage.setScene(s);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
