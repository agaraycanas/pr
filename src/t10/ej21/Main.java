package t10.ej21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static t10._util.Ficheros.leer;
import static t10._util.Ficheros.escribir;

public class Main {

	private static String s = "coloreado.htm";
	
	public static void main(String[] args) {
		generarHead();
		generarBody();
		System.out.println("FIN PROCESO");
	}

	private static Map<String,String> obtenerMapPalabras() {
		HashMap<String,String> colores = new HashMap<>();
		List<String> lineas = leer("palabras.txt");
		for ( String linea : lineas) {
			String[] parte = linea.split(":");
			colores.put(parte[0], parte[1]);
		}
		return colores; 
	}
	
	private static void generarBody() {
		escribir(s, "<body>");
		
		List<String> lineas = leer("original.txt");
		Map<String,String> colores = obtenerMapPalabras();
		for (String linea : lineas) {
			for ( String  palabra : colores.keySet()) {
				String palabraFormateada = 
						"<span class=\"" + 
						colores.get(palabra) +
						"\">" + 
						palabra +
						"</span>";
				linea = linea.replaceAll(palabra, palabraFormateada);
			}
			escribir(s, linea);
		}
		
		escribir(s, "</body>");
	}

	private static void generarHead() {
		List<String> lineas = leer("palabras.txt");
		
		HashSet<String> colores = new HashSet<>();
		for (String linea : lineas) {
			colores.add(linea.split(":")[1]);
		}

		escribir(s, "", false, false);
		escribir(s, "<head><style>");
		for (String color : colores) {
			escribir(s, "." + color + " {color:" + color + ";}");
		}
		escribir(s, "</style></head>");
	}

}
