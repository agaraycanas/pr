package t6.ej27;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Persona> personas = generarPersonas();
		mostrarPorOrdenNatural(personas);
		pintarSeparador();
		mostrarPorDNIAscendente(personas);
		pintarSeparador();
		mostrarPorDNIDescendente(personas);
	}

	private static void mostrarPorDNIAscendente(ArrayList<Persona> personas) {
		System.out.println("DNI ASCENDENTE");
		System.out.println();
		Collections.sort(personas,new CompararPorDNIAscendente());
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
	
	private static void mostrarPorDNIDescendente(ArrayList<Persona> personas) {
		System.out.println("DNI DESCENDENTE");
		System.out.println();
		Collections.sort(personas,new CompararPorDNIDescendente());
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

	private static void pintarSeparador() {
		System.out.println();
		System.out.println("==============================");
		System.out.println();
	}

	private static void mostrarPorOrdenNatural(ArrayList<Persona> personas) {
		System.out.println("ORDEN NATURAL");
		System.out.println();
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

	private static ArrayList<Persona> generarPersonas() {
		ArrayList<Persona> personas;
		personas = new ArrayList<>();
		personas.add(new Persona(3, "David", "Sánchez", LocalDate.of(2005, 1, 24)));
		personas.add(new Persona(2, "Ana", "Sánchez", LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(5, "Fransuá", "Francus", LocalDate.of(2002, 2, 2)));
		personas.add(new Persona(1, "Pepe", "Sánchez", LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(4, "Perico", "Smith", LocalDate.of(2004, 10, 10)));
		return personas;
	}

}
