package _pruebas.capas2;

public class Arriba2 implements Listener {
	public void arriba() {
		System.out.println("ARRIBA2");
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
