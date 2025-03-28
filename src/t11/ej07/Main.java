package t11.ej07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<String> l = List.of("una","dola","arco","tela","uno","catola","atención");

	public static void main(String[] args) {
		System.out.println(l);
		procesarClasico();
		procesarStream();
	}

	private static void procesarClasico() {
		List<String> listaFinal = new ArrayList<>();
		for (String  e : l ) {
			listaFinal.add(e.toUpperCase());
		}
		System.out.println(listaFinal);
	}

	private static void procesarStream() {
		System.out.println(
				l.stream()
					//.map( String::toUpperCase )
					.map( s -> s.toUpperCase() )
					.collect(Collectors.toList())
				);
		
	}
}
