package t13.ej01.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import t13.ej01.controller.ClienteController;

public class FormularioCliente extends Application {
	private ClienteController clienteController;
	
	private Text 		tDni;
	private Text 		tNombre;
	private TextField 	tfDni;
	private TextField	tfNombre;
	private Button 		bGuardar;
	private GridPane	grid;
	
	private void inicializarComponentes() {
		this.grid = new GridPane(2,3);

		this.tDni = new Text("DNI");
		this.tNombre = new Text("Nombre");
		this.tfDni = new TextField();
		this.tfNombre = new TextField();
		this.bGuardar = new Button("Guardar");
		
		this.bGuardar.setOnAction(e -> guardarCliente());

		grid.add(tDni, 0, 0);
		grid.add(tNombre, 0, 1);
		grid.add(tfDni, 1, 0);
		grid.add(tfNombre, 1, 1);
		grid.add(bGuardar, 0, 2, 3, 1);
		
		tDni.setFont(Font.font("Verdana", 20));
		tNombre.setFont(Font.font("Verdana", 20));
		tfDni.setFont(Font.font("Verdana", 20));
		tfNombre.setFont(Font.font("Verdana", 20));
		bGuardar.setFont(Font.font("Verdana", 20));
	}
	
	private void guardarCliente() {
		this.clienteController.crearCliente(tfDni.getText(),tfNombre.getText());
	}

	@Override
	public void start(Stage st) throws Exception {
		this.clienteController = new ClienteController();

		inicializarComponentes();
		
		Scene sc = new Scene(this.grid);
		st.setScene(sc);
		st.setTitle("CRUD Cliente");
		st.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
