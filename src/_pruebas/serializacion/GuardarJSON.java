package _pruebas.serializacion;

import com.google.gson.Gson;

import static t10._util.Ficheros.escribir;
import static t10._util.Ficheros.nuevoArchivo;

public class GuardarJSON {

	private static String fichero = "personas.json";

	public static void main(String[] args) {
		Gson g = new Gson();
		Persona p = new Persona(1,"Adán");
		nuevoArchivo(fichero);
		escribir(fichero,g.toJson(p));
		System.out.println("FIN de PROCESO");
	}

}
