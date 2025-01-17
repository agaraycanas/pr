package t4.c.ej18;

public class Persona {

	private String nombre;
	private String ape1;
	private String ape2;
	private String nacionalidad;

	public Persona(String nombre, String ape1, String ape2, String nacionalidad) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.nacionalidad = nacionalidad;
	}
	
	@Override
	public String toString() {
		return this.ape1+" "+this.ape2+", "+this.nombre + " ("+this.nacionalidad+")";
	}

}
