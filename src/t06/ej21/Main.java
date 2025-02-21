package t06.ej21;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(); 
		for (int i=0; i<args.length;i++) {
			a.add( Integer.parseInt( args[i] ));
		}
		
		System.out.println( a );
		Collections.sort(a);
		System.out.println( a );
	}
}
