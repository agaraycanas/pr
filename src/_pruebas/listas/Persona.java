package _pruebas.listas;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "(P) "+this.nombre;
	}
	
	public void saludar() {
		System.out.println("Hola, soy "+this.nombre);
	}
	@Override
	public boolean equals(Object persona) {
		return ((Persona)persona).nombre.equals ( this.nombre);
	}
}
