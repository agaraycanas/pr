package t10._util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {

	public static List<String> leer(String nombre, boolean rutaAlternativa, boolean silencioso) {

		String ruta = (rutaAlternativa ? "src/t10/_files/" : "../src/t10/_files/");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<String> lineas = new ArrayList<>();
		try {
			fr = new FileReader(ruta + nombre);
			br = new BufferedReader(fr);
			String linea;

			int n = 1;
			while ((linea = br.readLine()) != null) {
				if (!silencioso) {
					System.out.println("Procesada línea " + n + ": " + linea);
				}
				lineas.add(linea);
				n++;
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}
		return lineas;
	}

	public static void escribir(String nombreArchivo, String linea, boolean append, boolean rutaAlternativa) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			String ruta = rutaAlternativa?"../src/t10/_files/":"src/t10/_files/";
			fw = new FileWriter(ruta+nombreArchivo , append); 
			pw = new PrintWriter(fw);
			if (!linea.equals("")) {
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
