package t10.ej01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static String concatenar(String[] palabras) {
		String sol = "";
		int cont = 1;
		for ( String palabra : palabras ) {
			sol += palabra + (cont == palabras.length ? "" : " ");
			cont++;
		}
		return sol;
	}

	public static void main(String[] args) {
		try {
			//String contenido = concatenar(args);
			String contenido = String.join(" ", args);
			FileWriter f = new FileWriter("archivo.txt");
			f.write(contenido);
			System.out.println("Archivo creado");
			f.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
		System.out.println("FIN");
		
	}

}
