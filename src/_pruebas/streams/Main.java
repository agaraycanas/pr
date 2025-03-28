package _pruebas.streams;

import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		List<Persona> personas = List.of(
				new Persona("HOLA"),
				new Persona("Qué pasa"),
				new Persona("Buenos días"),
				new Persona("HOLA, qué tal")
				);
		System.out.println(personas);
		personas.stream()
			.forEach( System.out::println );
	}

}
