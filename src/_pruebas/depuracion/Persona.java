package _pruebas.depuracion;

public class Persona {
	private int dni;
	private String nombre;

	public Persona(int dni, String nombre) {
		this.dni= dni;
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.nombre;
	}
	
	public boolean equals(Object o) {
		return ( this.dni == ((Persona)o).dni ); 
	}
}
