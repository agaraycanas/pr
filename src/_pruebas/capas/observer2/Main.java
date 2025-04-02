package _pruebas.capas.observer2;

public class Main {

	public static void main(String[] args) {
		Abajo abajo= new Abajo();
		Arriba arriba = new Arriba(abajo);
		abajo.accionAbajo();
	}

}
