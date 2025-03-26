package t11.ej05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Restarle 3 a cada elemento
Quedarse con los números mayores que cero
Multiplicarlos por dos
Restarles 1
Quedarse con los números que estén entre 50 y 75.
 
 */
public class Main {

	private static List<Integer> l = List.of(-1, 40, 2, -6, 1, 79, -4, 67, 38);

	public static void main(String[] args) {
		System.out.println(l);
		procesarClasico();
		procesarClasico2();
		procesarStream();
	}

	/*
	Restarle 3 a cada elemento
	Quedarse con los números mayores que cero
	Multiplicarlos por dos
	Restarles 1
	Quedarse con los números que estén entre 50 y 75.
	 */
	private static void procesarStream() {
		System.out.println(
				l.stream()
					.map(a->a-3)
					.filter(a->a>0)
					.map(a->a*2)
					.map(a->a-1)
					.filter(a->a>=50&&a<=75)
					.collect(Collectors.toList())
		);
	}

	private static void procesarClasico2() {
		
		List<Integer> listaFinal = new ArrayList<>();
		for (Integer e : l) {
			Integer nuevo = e;
			nuevo = nuevo-3; 						// Paso 1: Restarle 3 a cada elemento
			nuevo = nuevo>0 ? nuevo : null; 		// Paso 2: Quedarse con los números mayores que cero
			nuevo = nuevo!=null ? nuevo*2 : null; 	// Paso 3: Multiplicarlos por dos
			nuevo = nuevo!=null ? nuevo-1 : null; 	// Paso 4: Restarles 1
			nuevo = (nuevo!=null && nuevo>=50 && nuevo<=75) ? nuevo : null;// Paso 5: Quedarse con los números que estén entre 50 y 75	
			if (nuevo!=null) {
				listaFinal.add(nuevo);
			}
		}
		System.out.println(listaFinal);
	}	
	
	private static void procesarClasico() {
		// Paso 1: Restarle 3 a cada elemento
		List<Integer> l1 = new ArrayList<>();
		for (Integer e : l) {
			l1.add(e - 3);
		}

		// Paso 2: Quedarse con los números mayores que cero
		List<Integer> l2 = new ArrayList<>();
		for (Integer e : l1) {
			if (e > 0) {
				l2.add(e);
			}
		}

		// Paso 3: Multiplicarlos por dos
		List<Integer> l3 = new ArrayList<>();
		for (Integer e : l2) {
			l3.add(e * 2);
		}

		// Paso 4: Restarles 1
		List<Integer> l4 = new ArrayList<>();
		for (Integer e : l3) {
			l4.add(e - 1);
		}

		// Paso 5: Quedarse con los números que estén entre 50 y 75
		List<Integer> l5 = new ArrayList<>();
		for (Integer e : l4) {
			if (e >= 50 && e <= 75) {
				l5.add(e);
			}
		}

		System.out.println(l5);
	}


}
