package t11.ej06;

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
			if (e.charAt(0)=='a') {
				listaFinal.add(e);
			}
		}
		System.out.println(listaFinal);
	}

	private static void procesarStream() {
		System.out.println(
				l.stream()
					.filter( s ->  s.startsWith("a"))
					//.filter( s ->  s.charAt(0)=='a')
					.collect(Collectors.toList())
				);
		
	}
}
