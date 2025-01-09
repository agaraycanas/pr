package t4.b.ej14;

public class Informatico extends Trabajador {
	
	public Informatico(String nombre) {
		super(nombre);
	}
	
	public void saludar() {
		System.out.println(this.getNombre() + " listo para programar");
	}
	
	public void programar() {
		System.out.println("A ver, public class " + this.getNombre() + "...NO");	
	}
	
}
