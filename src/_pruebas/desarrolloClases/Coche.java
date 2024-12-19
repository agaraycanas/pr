package _pruebas.desarrolloClases;

public class Coche {
	Rueda di;
	Rueda dd;
	Rueda ti;
	Rueda td;
	
	
	public Coche() {
		this.di = new Rueda();
		this.dd = new Rueda();
		this.ti = new Rueda();
		this.td = new Rueda();
	}
	
	public void diagnostico() {
		System.out.println("Delantera derecha: "+ this.dd.presion);
		System.out.println("Delantera izquierda: "+ this.di.presion);
		System.out.println("Trasera derecha: "+ this.td.presion);
		System.out.println("Trasera izquierda: "+ this.ti.presion);
	}
}
