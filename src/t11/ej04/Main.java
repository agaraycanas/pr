package t11.ej04;

import java.util.List;

public class Main {

	private static List<Integer> l = List.of(-1,5,2,-6,1,11,-4,4);
	
	public static void main(String[] args) {
		System.out.println(l);
		procesarClasico();
		procesarStream();
		procesarStream2();
	}


	private static void procesarStream() {
		System.out.println("Resultado: "+ l.stream().reduce(Integer.MAX_VALUE,(a,b)->b<a?b:a));
	}

	private static void procesarStream2() {
		System.out.println("Resultado: "+ l.stream().min(Integer::compare).get());
	}

	private static void procesarClasico() {
		int minimoProvisional = Integer.MAX_VALUE;
		
		for ( Integer e : l ) {
			minimoProvisional = e<minimoProvisional ? e : minimoProvisional;
		}
		System.out.println("Resultado: " + minimoProvisional);
	}

}
