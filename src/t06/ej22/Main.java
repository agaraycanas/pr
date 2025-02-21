package t06.ej22;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<String,String> equipo = new TreeMap<>();
		equipo.put("Marcelo", "Atlético de Madrid");
		equipo.put("Aitor", "Sporting de Gijón");
		equipo.put("Dylan", "Getafe");
		equipo.put("Víctor", "Klub nosequé");
		equipo.put("Angie", "Real Madrid");
		equipo.put("Alberto", "Brasileiro");
		equipo.put("David", "Atlético de Madrid");
		equipo.put("Nosé", "Atlético de Madrid");
		equipo.put("Merengue", "Real Madrid");
		equipo.put("Angie", "Atlético de Madrid");
		
		
		System.out.println(equipo.keySet());
		System.out.println(equipo);
		equipo.remove("Alberto");
		System.out.println(equipo.keySet());
		System.out.println(equipo);
	}

}
