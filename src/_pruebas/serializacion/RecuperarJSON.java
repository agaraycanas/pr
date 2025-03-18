package _pruebas.serializacion;

import static t10._util.Ficheros.leer;

import java.util.List;

import com.google.gson.Gson;

public class RecuperarJSON {

	private static String fichero = "personas.json";

	public static void main(String[] args) {
		List<String> lineas = leer(fichero);
		Gson g = new Gson();
		for (String linea :  lineas ) {
			Persona p = g.fromJson(linea, Persona.class);
			System.out.println(p);
		}
	}

}
