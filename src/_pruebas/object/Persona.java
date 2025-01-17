package _pruebas.object;

public class Persona extends SerVivo {
	private String dni;
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad= edad;
		this.dni= dni;
	}
	
	public String toString() {
		return this.nombre + "("+this.dni+")";
	}
}
