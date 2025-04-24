package _pruebas.capas2;

public class Abajo {
	public void abajo() {
		System.out.println("ABAJO");
	}
	public static void main(String[] args) {
		Listener listener = new Arriba2();
		listener.accion();
	}
}
