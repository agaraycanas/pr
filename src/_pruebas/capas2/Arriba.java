package _pruebas.capas2;

public class Arriba implements Listener {
	public void arriba() {
		System.out.println("ARRIBA1");
	}
	public static void main(String[] args) {
		Abajo abajo = new Abajo(); 
		abajo.abajo();
	}
	@Override
	public void accion() {
		this.arriba();
		
	}
}
