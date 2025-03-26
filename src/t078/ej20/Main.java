package t078.ej20;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(); 
		for (int i=0; i<args.length;i++) {
			int numero = Integer.parseInt( args[i] );
			Integer objetoInteger = new Integer(numero);
			a.add(objetoInteger);
		}
		
		System.out.println( a );
		Collections.sort(a);
		System.out.println( a );
	}
}
