package t6.ej00;



public class Perro 

implements 	Comparable
			,Mascota // ej 15

{
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
		System.out.println("GUAU. Soy "+this.collar+" de "+this.peso+" Kg.");
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

	// EJERCICIO 4
	public int compareTo(Object o) {
		int sol = 0;
		
		if (o instanceof Humano) {
			sol = -1;
		}	
		if ( o instanceof Gato ) {
			sol = 1;
		}

		if (o instanceof Perro && ((Perro)o).collar < this.collar ) {
			sol = 1;
		}

		if (o instanceof Perro && ((Perro)o).collar > this.collar ) {
			sol = -1;
		}

		return sol;
	}
	
	// EJERCICIO 5
	@Override
	public int hashCode() {
		return this.collar;
	}

}
