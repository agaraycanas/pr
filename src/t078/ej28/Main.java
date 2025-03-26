package t078.ej28;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Persona> personas = generarPersonas();
		mostrarEncabezado("PERSONAS");
		mostrarPersonas(personas);
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
	
	private static void mostrarPorOrdenNatural(ArrayList<Persona> personas) {
		System.out.println("ORDEN NATURAL");
		System.out.println();
		mostrarPersonas(personas);
	}

	// =================================================================================

	private static Set<Persona> generarPersonas() {
		
		TreeSet<Persona> personas;
		personas = new TreeSet<Persona>(new OrdenarPorDniAsc());
		
		/*
		HashSet personas;
		personas = new HashSet();
		*/
		personas.add(new Persona(10, "Decimo", "Diez", LocalDate.of(2004, 10, 10)));
		personas.add(new Persona(3, "David", "Sanchez", LocalDate.of(2005, 1, 24)));
		personas.add(new Persona(2, "Ana", "Sanchez", LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(5, "Fransua", "Francus", LocalDate.of(2002, 2, 2)));
		personas.add(new Persona(1, "Pepe", "Sanchez", LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(4, "Perico", "Smith", LocalDate.of(2004, 10, 10)));
		personas.add(new Persona(4, "NUEVO", "NUEVO", LocalDate.of(2004, 10, 10)));
		return personas;
	}

}
