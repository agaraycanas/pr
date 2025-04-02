package _pruebas.capas.observer2;

public class Arriba {
	
	private Listener oreja;
	private Abajo abajo;

	public Arriba(Abajo abajo) {
		this.abajo = abajo;
		this.oreja = e -> accionArriba(e);
		this.abajo.setArriba(oreja);
	}
	
	public void accionArriba(Evento e) {
		System.out.println("ACCIÓN ARRIBA");
		System.out.println("\t"+e.getMensaje());
	}


}
