package t6.ej00;

public class Humano 

implements Comparable

{
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
	
	// EJERCICIO 2
	@Override
	public String toString() {
		return "(H) "+this.dni+" "+this.nombre;
	}

	// EJERCICIO 3
	@Override
	public boolean equals(Object otro) {
		return 	otro instanceof Humano 			&& 
				((Humano)otro).dni == this.dni;
	}

	// EJERCICIO 4
	public int compareTo(Object o) {
		int sol = 0;
		
		if (o instanceof Perro || o instanceof Gato ) {
			sol = 1;
		}

		if (o instanceof Humano && ((Humano)o).dni < this.dni ) {
			sol = 1;
		}

		if (o instanceof Humano && ((Humano)o).dni > this.dni ) {
			sol = -1;
		}

		return sol;
	}
	
	// EJERCICIO 5
	@Override
	public int hashCode() {
		return this.dni ;
	}
	
}
