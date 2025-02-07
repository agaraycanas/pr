package _pruebas.listas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<>();
		
		personas.add(new Persona("Pepe"));
		personas.add(new Persona("Juan"));
		personas.add(new Persona("Ana"));
		personas.add(new Persona("Manuela"));
		personas.add(new Persona("Juan"));

		System.out.println(personas.indexOf(new Persona("Juan")));
	}

}
