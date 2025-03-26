package t11.ej03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<Integer> l = List.of(-1,5,2,-6,1,11,-4,4);
	
	public static void main(String[] args) {
		System.out.println(l);
		procesarClasico();
		procesarStream();
	}

	private static void procesarStream() {
		System.out.println("Resultado: "+ l.stream().reduce(1,(a,b)->a*b));
	}

	private static void procesarClasico() {
		int solucion = 1;
		for ( Integer e : l ) {
			solucion = solucion * e;
			//System.out.println(solucion);
		}
		System.out.println("Resultado: " + solucion);
	}

}
