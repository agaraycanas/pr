package t6.ej00;

public class Gato {

	private String nombre;
	private float peso;
	
	public Gato(String nombre, float peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPeso() {
		return peso;
	}
	
	public void saludar() {
		System.out.println("MIAU");
	}
	
}
