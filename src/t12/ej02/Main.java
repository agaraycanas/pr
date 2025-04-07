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
	
	private Text pantalla;
	
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		/*
		panelSaludo.setFont(Font.font("Verdana", 20));
		boton.setFont(Font.font("Verdana", 20));
		*/
		int[] a = {
				7,8,9,
				4,5,6,
				1,2,3,
				-1,0,-2
				};

		this.pantalla = new Text("");
		pantalla.setFont(Font.font("Verdana", 20));
		grid.add(pantalla, 0, 0, 3,1);

		for (int i=0;i<12;i++) {
			String etiqueta = "";
			if (a[i]>=0) {
				etiqueta += a[i];
			}
			else {
				etiqueta = a[i]==-1 ? "+" : "=";
			}
			Button boton = new Button(etiqueta);
			boton.setFont(Font.font("Verdana", 20));
			final String et = etiqueta;
			boton.setOnAction( e -> accion(et) );
			grid.add(boton, i%3, (i/3)+1);
		}
		
		Scene s = new Scene(grid);
		primaryStage.setScene(s);
		primaryStage.show();
	}

	private void accion(String etiqueta) {
		if (!etiqueta.equals("=")) {
			this.pantalla.setText( pantalla.getText() + etiqueta ) ;
		}
		else {
			calcularSuma();
		}
	}
	
	private void calcularSuma() {
		String pString = this.pantalla.getText();
		String[] apString = pString.split("\\+");
		int sol = 0;
		for (String numString : apString) {
			int num = Integer.parseInt( numString );
			sol += num;
		}
		this.pantalla.setText(sol+"");
	}

	public static void main(String[] args) {
		launch();
	}

}
