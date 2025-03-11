package t10.ej13;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		/*
		String[] contenido = { 
				"En un tonto lugar tonto", 
				"de La Mancha", 
				"de cuyo nombre", 
				"no quiero acordarme" 
				};
		*/
		String[] contenido = {"una","dola","tela","catola"};
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			String ruta = "src/t10/_files/";
			//String ruta = "../src/t10/_files/";
			String nombre = "s.txt";
			fw = new FileWriter(ruta+nombre); // (ruta,true) para añadir
			pw = new PrintWriter(fw);
			for ( String linea : contenido) {
				pw.println(linea);
			}
		} catch (Exception e) {
			System.out.println("Error al escribir " + e.getMessage());
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				System.out.println("Error al cerrar " + e.getMessage());
			}
		}
	}
}