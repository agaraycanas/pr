package t12._ejemplos.boton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	/*
	class Oreja implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			System.out.println("CLAC");
		}
	}
	*/
	
	TextField nombre ;
	Text panelSaludo ;
	Button boton ;
 
	private void accion() {
		String mensaje = "Hola " + this.nombre.getText();
		panelSaludo.setText(mensaje);
	}
	
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane(3, 1);

		 this.nombre = new TextField("");
		 this.panelSaludo = new Text("");
		 this.boton = new Button("Saludar");
		
		boton.setOnAction( e -> accion() );
		
		/*
		boton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				accion();
			}
		}
		);
		*/
		//boton.setOnAction(new Oreja());

		nombre.setMinWidth(100);
		nombre.setFont(Font.font("Verdana", 20));
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
