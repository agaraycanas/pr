package t10._util;

import java.io.BufferedReader;
import java.io.FileReader;
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

}
