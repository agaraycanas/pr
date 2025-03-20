package _pruebas.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) {
		Gson g = new Gson();
		String json = """
			[
			{"titulo":"El Sr. de Los Anillos"},
			{"titulo":"El hobbit"},
			{"titulo":"El Quijote"},
			{"titulo":"La Galatea"}
			]	
				""";
		Type tipoLista = new TypeToken<List<Libro>>(){}.getType();
		List<Libro> libros = g.fromJson(json,  tipoLista );
		for ( Libro libro : libros) {
			System.out.println(libro);
		}
	}

}
