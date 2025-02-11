package t6.ej23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
		System.out.println( equipo.values() );
	}

	private static void listadoDeAlumnos(Map<String, String> equipo) {
		System.out.println( equipo.keySet() );
	}

}
