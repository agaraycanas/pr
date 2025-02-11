package _pruebas.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {

	public static void main(String[] args) {
		Map<String,String> equipo = new TreeMap<>();
		
		equipo.put("C", "B");
		equipo.put("A", "B");
		equipo.put("CA", "B");
		equipo.put("B", "B");
		System.out.println(equipo);
	}

}
