package t10.ej21;

import java.util.HashSet;
import java.util.List;
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

	private static Set<String> obtenerSetPalabras() {
		HashSet<String> palabras = new HashSet<>();
		List<String> lineas = leer("palabras.txt");
		for ( String linea : lineas) {
			palabras.add( linea.split(":")[0] );
		}
		//System.out.println(palabras); //TODO DEBUG
		return palabras; 
	}
	
	private static void generarBody() {
		escribir(s, "<body>");
		
		List<String> lineas = leer("original.txt");
		Set<String> palabras = obtenerSetPalabras();
		for (String linea : lineas) {
			for ( String palabra: palabras) {
				linea = linea.replaceAll(palabra, "*****");
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
