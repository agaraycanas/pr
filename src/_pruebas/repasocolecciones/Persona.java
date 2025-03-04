package _pruebas.repasocolecciones;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido= apellido;
	}
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido
				+ "["+this.hashCode()+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.nombre,this.apellido);
				
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean sol = false;
		if (obj instanceof Persona && ((Persona)obj).nombre.equals(this.nombre) &&  ((Persona)obj).apellido.equals(this.apellido)) {
			sol = true;
		}
		return sol;
	}
	
	@Override
	public int compareTo(Persona p) {
		return - this.nombre.compareTo(p.nombre);
	}
}
