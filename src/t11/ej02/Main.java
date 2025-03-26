package t11.ej02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<Integer> l = List.of(-10,15,20,-65,1,101,-40,4);
	
	public static void main(String[] args) {
		System.out.println(l);
		procesarClasico();
		procesarStream();
	}

	private static void procesarStream() {
		System.out.println(l.stream().filter(a->a%2==0).collect(Collectors.toList()));
	}

	private static void procesarClasico() {
		List<Integer> listaProcesada = new ArrayList<>();
		for ( Integer e : l ) {
			if ( e%2 == 0) {
				listaProcesada.add( e );
			}
		}
		System.out.println(listaProcesada);
	}

}
