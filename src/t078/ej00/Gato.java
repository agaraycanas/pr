package t078.ej00;

import java.util.Objects;

public class Gato 

implements 	Comparable
			,Mascota // ej 15

{
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
		System.out.println("MIAU. Soy "+this.nombre+" de "+this.peso+" Kg.");
	}
	
	// EJERCICIO 2
	@Override
	public String toString() {
		return "(G) "+this.nombre+" "+this.peso;
	}
	
	// EJERCICIO 3
	@Override
	public boolean equals(Object otro) {
		return 	otro instanceof Gato 						&& 
				((Gato)otro).nombre.equals (this.nombre) 	&&
				((Gato)otro).peso 	== 		this.peso; 
				
	}

	// EJERCICIO 4
	public int compareTo(Object o) {
		int sol = 0;
		
		if (o instanceof Perro || o instanceof Humano ) {
			sol = -1;
		}

		if (o instanceof Gato ) {
			Gato otroGato = (Gato)o;
			 sol = this.nombre.compareTo(otroGato.nombre);
			 if (sol == 0) {
				 if (this.peso > otroGato.peso ) {
					 sol = -1;
				 }
				 if (this.peso < otroGato.peso ) {
					 sol = 1;
				 }
			 }
		}


		return sol;
	}	
	
	
	// EJERCICIO 5
	@Override
	public int hashCode() {
		return Objects.hash ( this.nombre, this.peso);
	}
}
