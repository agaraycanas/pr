package t5.ej05;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Persona[] a = { 
				new Persona(50,"Almudena", "Rodríguez"), 
				new Persona(100,"Jorge", "Alamán"), 
				new Persona(10,"Pedro", "Alamán"), 
				new Persona(7,"Pepito", "Rodríguez"), 
				};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
