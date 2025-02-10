package _pruebas.conjuntos;

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
	
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona)obj;
		return this.nombre == p.nombre;
	}
	
	public void saludar() {
		System.out.println("HOla, soy " + this.nombre);
	}
}
