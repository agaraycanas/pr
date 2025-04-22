package ej03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UI extends Application {
	private TextField tf1;
	private TextField tf2;
	private Text t;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage st) throws Exception {
		GridPane grid = new GridPane();
		
		tf1 = new TextField();
		tf2 = new TextField();
		Button b1 = new Button("Concatenar (derecho)");
		Button b2 = new Button("Concatenar (revés)");
		t = new Text();
		
		grid.add(tf1, 0, 0);
		grid.add(tf2, 1, 0);
		grid.add(b1, 0, 1);
		grid.add(b2, 1, 1);
		grid.add(t, 0, 2, 2, 1);
		
		b1.setOnAction(e->derecho());
		b2.setOnAction(e->reves());

		st.setScene(new Scene(grid));
		st.show();
	}

	private void reves() {
		t.setText(tf2.getText()+tf1.getText());
	}

	private void derecho() {
		t.setText(tf1.getText()+tf2.getText());
	}

}
