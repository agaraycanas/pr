package t078.ej24;

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
		equipo.put("Otro Merengue"	, "Real Madrid");
		
		listadoDeEquiposYAficionados(equipo);
		
	}

	private static void listadoDeEquiposYAficionados(Map<String, String> equipos) {
		/* ALGORITMO
		 * 0) Crear un Map<String,Integer> vacío
		 * 1) Recorrer los equipos
		 * 2) Introducir cada equipo en un Map<String,Integer> 
		 * en el que cada nombre esté asociado al número de hinchas
		 * que tiene
		 * 3) En un "if" controlar a la hora de introducir el elemento
		 * si es la primera vez que entra esa "clave", con lo que lo asociaremos
		 * al número "1" y en caso contrario:
		 * - obtener el número asociado a la clave, sumarle 1 y susituir dicho elemento por
		 * el antiguo en el Map 
		 */
		TreeMap<String,Integer> hinchas = new TreeMap<>();
		for ( String equipo : equipos.values()) {
			if (hinchas.keySet().contains(equipo)) {
				hinchas.put(equipo, hinchas.get(equipo) + 1 ) ;
			}
			else {
				hinchas.put(equipo, 1);
			}
		}
		
		System.out.println(hinchas);
		
		for ( String equipo : hinchas.keySet() ) {
			System.out.println(equipo+"\t"+hinchas.get(equipo));
		}
	}
}
