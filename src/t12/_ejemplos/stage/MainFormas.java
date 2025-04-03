package t12._ejemplos.stage;
	

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainFormas extends Application {
	@Override
	public void start(Stage primaryStage) {
		Group g = new Group();
		
		Text text = new Text();
		text.setText("HOLA MUNDO");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.GREEN);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(400);
		line.setEndY(100);
		line.setStrokeWidth(5);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(150);
		rectangle.setHeight(100);
		rectangle.setFill(Color.CORNSILK);
		
		g.getChildren().addAll(text,line,rectangle);
		
		Scene s = new Scene(g);
		primaryStage.setScene(s);
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
