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
	
	// EJERCICIO 2
	@Override
	public String toString() {
		return "(P) "+this.collar+" "+this.peso;
	}
	
	// EJERCICIO 3
	@Override
	public boolean equals(Object otro) {
		return 	otro instanceof Perro 			&& 
				((Perro)otro).collar == this.collar;
	}
}
