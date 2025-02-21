package t04.b.ej14;

public class Persona {
	
	private String nombre;
	
	public Persona( String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void saludar( Persona persona ) {
		System.out.println("Hola " + persona.getNombre() +", soy " + this.nombre);
	}
	
	public void saludar() {
		System.out.println("Hola, soy " +  this.nombre);
	}
	
}
