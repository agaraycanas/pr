package t6.ej23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Map<String,String> equipo = new TreeMap<>();
		equipo.put("Marcelo"	, "Atlético de Madrid");
		equipo.put("Aitor"		, "Sporting de Gijón");
		equipo.put("Dylan"		, "Getafe");
		equipo.put("Víctor"		, "Klub nosequé");
		equipo.put("Angie"		, "Real Madrid");
		equipo.put("Alberto"	, "Brasileiro");
		equipo.put("David"		, "Atlético de Madrid");
		equipo.put("Nosé"		, "Atlético de Madrid");
		equipo.put("Merengue"	, "Real Madrid");
		equipo.put("Angie"		, "Atlético de Madrid");
		
		listadoDeAlumnos(equipo);
		listadoDeEquipos(equipo);
		
	}

	private static void listadoDeEquipos(Map<String, String> equipo) {
		/* OPCIÓN 1
		TreeSet<String> ord = new TreeSet<>();
		for (String eq : equipo.values()) {
			ord.add(eq);
		}
		System.out.println(ord);
		*/
		/* OPCIÓN 2
		TreeSet<String> ord = new TreeSet<>();
		ord.addAll(equipo.values());
		System.out.println(ord);
		*/
		System.out.println(new TreeSet<String>(equipo.values()));
	}

	private static void listadoDeAlumnos(Map<String, String> equipo) {
		System.out.println( equipo.keySet() );
	}

}
