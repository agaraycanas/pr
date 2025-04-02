package _pruebas.capas.observer2;

public class Abajo {
	private Listener arriba;
	
	public void setArriba(Listener arriba) {
		this.arriba = arriba;
	}
	
	public void accionAbajo() {
		System.out.println("ACCIÓN ABAJO");
		this.arriba.accionar(new Evento("Ha ocurrido algo importante"));
	}
}
