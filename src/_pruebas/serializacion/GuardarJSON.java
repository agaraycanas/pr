package _pruebas.serializacion;

import com.google.gson.Gson;

import static t10._util.Ficheros.escribir;
import static t10._util.Ficheros.nuevoArchivo;

import java.util.ArrayList;

public class GuardarJSON {

	private static String fichero = "personas.json";

	public static void main(String[] args) {
		Gson g = new Gson();
		ArrayList<Persona> personas = new ArrayList<>();
		Persona adan = new Persona(1,"Adán",null,null);
		Persona eva = new Persona(2,"Eva",null,null);
		personas.add(adan);
		personas.add(eva);
		personas.add(new Persona(3,"Caín",adan,eva));
		nuevoArchivo(fichero);
		escribir(fichero,g.toJson(personas));
		System.out.println("FIN de PROCESO");
	}

}
