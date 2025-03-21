package _pruebas.serializacion;

import static t10._util.Ficheros.leer;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public class RecuperarJSON {

	private static String fichero = "personas.json";

	public static void main(String[] args) {
		List<String> lineas = leer(fichero);
		Gson g = new Gson();
		for (String linea :  lineas ) {
			Type personaListType = new TypeToken<List<Persona>>(){}.getType();
			ArrayList<Persona> personas = g.fromJson(linea, personaListType);
			System.out.println(personas);
		}
	}

}
