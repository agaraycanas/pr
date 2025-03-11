package _pruebas.ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void escribir(String nombreArchivo, String linea) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			String ruta = "src/t10/_files/";
			// String ruta = "../src/t10/_files/";
			String nombre = "s.txt";
			fw = new FileWriter(ruta + nombreArchivo, true); // (ruta,true) para añadir
			pw = new PrintWriter(fw);
			pw.println(linea);
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

	public static void main(String[] args) {
		escribir("test.txt", "adios");
	}

}
