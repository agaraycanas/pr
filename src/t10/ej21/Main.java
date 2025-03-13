package t10.ej21;

import java.util.HashSet;
import java.util.List;

import static t10._util.Ficheros.leer;
import static t10._util.Ficheros.escribir;

public class Main {

	public static void main(String[] args) {
		generarHead(leer("palabras.txt"));
		System.out.println("FIN PROCESO");
	}

	private static void generarHead(List<String> lineas) {
		String s = "coloreado.htm";
		HashSet<String> colores = new HashSet<>(); 
		for (String linea : lineas) {
			colores.add( linea.split(":")[1] );
		}
		
		escribir(s,"",false,false);
		escribir(s,"<head><style>");
		for ( String color : colores ) {
			escribir(s, "."+ color+ " {color:"+ color+";}");
		}
		escribir(s,"</style></head>");
	}

}
