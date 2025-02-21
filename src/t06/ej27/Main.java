package t06.ej27;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Persona> personas = generarPersonas();
		mostrarPorOrdenNatural(personas);
		pintarSeparador();
		mostrarPorDNIAscendente(personas);
		pintarSeparador();
		mostrarPorDNIDescendente(personas);
		pintarSeparador();
		mostrarPorApeAscNomAsc(personas);
		pintarSeparador();
		mostrarPorEdadAscDniAsc(personas);
	}

	// =================================================================================

	private static void pintarSeparador() {
		System.out.println();
		System.out.println("==============================");
		System.out.println();
	}

	private static void mostrarEncabezado(String titulo) {
		System.out.println(titulo);
		System.out.println();
	}
	
	private static void mostrarPersonas(Collection<Persona> personas) {
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

	// =================================================================================
	
	private static void mostrarPorEdadAscDniAsc(ArrayList<Persona> personas) {
		mostrarEncabezado("Edad asc., DNI asc.");
		Collections.sort(personas, new CompararPorEdadAscDniAsc());
		mostrarPersonas(personas);
	}
	
	private static void mostrarPorApeAscNomAsc(ArrayList<Persona> personas) {
		mostrarEncabezado("Apellido asc., Nombre asc.");
		Collections.sort(personas, new CompararPorApeAscNomAsc());
		mostrarPersonas(personas);
	}

	private static void mostrarPorDNIAscendente(ArrayList<Persona> personas) {
		mostrarEncabezado("DNI ASCENDENTE");
		Collections.sort(personas, new CompararPorDNIAscendente());
		mostrarPersonas(personas);
	}

	private static void mostrarPorDNIDescendente(ArrayList<Persona> personas) {
		mostrarEncabezado("DNI DESCENDENTE");
		Collections.sort(personas, new CompararPorDNIDescendente());
		mostrarPersonas(personas);
	}

	private static void mostrarPorOrdenNatural(ArrayList<Persona> personas) {
		System.out.println("ORDEN NATURAL");
		System.out.println();
		mostrarPersonas(personas);
	}

	// =================================================================================

	private static ArrayList<Persona> generarPersonas() {
		ArrayList<Persona> personas;
		personas = new ArrayList<>();
		personas.add(new Persona(10, "Decimo", "Diez", LocalDate.of(2004, 10, 10)));
		personas.add(new Persona(3, "David", "Sanchez", LocalDate.of(2005, 1, 24)));
		personas.add(new Persona(2, "Ana", "Sanchez", LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(5, "Fransua", "Francus", LocalDate.of(2002, 2, 2)));
		personas.add(new Persona(1, "Pepe", "Sanchez", LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(4, "Perico", "Smith", LocalDate.of(2004, 10, 10)));
		return personas;
	}

}
