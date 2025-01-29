package t6.ej00;

public class Humano {
	private int dni;
	private String nombre;
	
	public Humano(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void saludar() {
		System.err.println("HOLA");
	}
}
