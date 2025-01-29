package _pruebas.colecciones;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	
	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "("+this.dni+") "+this.nombre+" "+this.apellido;
	}
	
	@Override
	public boolean equals(Object otro) {
		return this.dni.equals(((Persona)otro).dni);
	}
	
}
