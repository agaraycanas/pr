package t6.ej00;

public class Perro {
	private int collar;
	private float peso;
	
	public Perro(int collar, float peso) {
		this.collar = collar;
		this.peso = peso;
	}

	public int getCollar() {
		return collar;
	}

	public float getPeso() {
		return peso;
	}
	
	public void saludar() {
		System.out.println("GUAU");
	}
	
	
}
