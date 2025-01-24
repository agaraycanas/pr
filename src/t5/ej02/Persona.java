package t5.ej02;

public class Persona implements Comparable {
	
	private int dni;
	private String nombre;
	private String apellido;

	
	
	public Persona(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return  "("+this.dni+") "+this.nombre+" "+this.apellido;
	}


	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

}
