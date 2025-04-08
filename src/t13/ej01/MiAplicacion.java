package t13.ej01;

import t13.ej01.view.FormularioCliente;

public class MiAplicacion {
	private FormularioCliente fc;

	public MiAplicacion() {
		this.fc=new FormularioCliente();
	}
	
	public static void main(String[] args) {
		new MiAplicacion();
	}

}
