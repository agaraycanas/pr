package t10._util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {

	public static List<String> leer(String nombre) {
		return leer(nombre,false,true);
	}
	
	/**
	 * <p>Añade una linea al final del archivo especificado.</p>
	 * <p>Se asume que estoy funcionando desde el IDE y <b>NO</b> desde la
	 * linea de comandos (utilizando argumentos de entrada)
	 * @param nombreArchivo el nombre del archivo en el que se escribe
	 * @param linea que se añadirá AL FINAL del archivo
	 */
	public static void escribir(String nombreArchivo, String linea) {
		escribir(nombreArchivo,linea,true,false);
	}
	
	public static List<String> leer(String nombre, boolean rutaAlternativa, boolean silencioso) {

		String ruta = (rutaAlternativa ? "../src/t10/_files/" : "src/t10/_files/");
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

	/**
	 * 
	 * @param nombreArchivo el nombre del archivo a escribir en la carpeta "src/t10/_files" 
	 * @param linea la linea a escribir
	 * @param append añade la linea al final del fichero si <code>true</code>. Destruye el contenido
	 * inicial del fichero en caso contrario
	 * @param rutaAlternativa <code>true</code> si estamos trabajando desde el terminal. <code>false</code> en caso contrario
	 */
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
