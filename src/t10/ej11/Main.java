package t10.ej11;

import java.util.List;
import t10._util.Ficheros;

public class Main {
	public static void main(String[] args) {
		String nombreABuscar = args.length>0 ? args[0] : "ana";
		List<String> lineas = Ficheros.leer("nombres.txt", false, true);
		int contador = 0;
		for ( String linea : lineas) {
			//System.out.println("Procesando linea: " + linea); // TODO DEBUG
			String[] palabras = linea.split(" ");
			for (String palabra : palabras ) {
				//System.out.println("Procesando palabra: " + palabra); // TODO DEBUG
				if (nombreABuscar.equals(palabra)) {
					contador++;
				}
			}
			
		}
		System.out.println(nombreABuscar + " aparece " + contador +" veces");
	}
}
