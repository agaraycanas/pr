package t10.ej07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		String ruta = "../src/t10/_files/";
		String nombre = "archivo.txt";
		
		try {
			fr = new FileReader(ruta + nombre);
			br = new BufferedReader(fr);
			String linea;
			int nLineas = 0;
			
			while ((linea = br.readLine()) != null) {
				nLineas++;
				System.out.println(nLineas + ": "+linea);
			}
			
			System.out.println("Número de lineas: " + nLineas);

		} catch (Exception e) {
			// TODO
			System.out.println("Error al leer");
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO
				System.out.println("Error al cerrar");
			}
		}

	}

}
