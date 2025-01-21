package _pruebas.composicion;

public class Persona {
	
	private Brazo brazoDerecho;
	
	public Persona() {
		this.brazoDerecho = new Brazo();
	}
	
	public String toString() {
		return "PERSONA //"+this.brazoDerecho;
	}
	
	public Brazo getBrazoDerecho() {
		return brazoDerecho;
	}
	
	public void setBrazoDerecho(Brazo bd) {
		this.brazoDerecho = bd;
	}
}
