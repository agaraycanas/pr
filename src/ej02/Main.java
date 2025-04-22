package ej02;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

public class Main {

	public static String leerFichero() {
		FileReader fr = null;
		BufferedReader br = null;
		String lineaFinal="";
		String linea="";
		try {
			fr = new FileReader("datos.json");
			br = new BufferedReader(fr);
			
			while ((linea = br.readLine()) != null) {
				lineaFinal += linea+"\n";
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
		return lineaFinal;
	}

	public static void main(String[] args) {
		String dato = leerFichero();
		Gson g = new Gson();
		Numero n = g.fromJson(dato, Numero.class);
		System.out.println(n.getN() + (n.getN()%2==0?" ":" no " ) + "es par");
	}
}
