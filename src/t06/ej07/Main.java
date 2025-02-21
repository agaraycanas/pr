package t06.ej07;

import java.util.Collection;
import java.util.LinkedList;

import t06.ej00.Gato;
import t06.ej00.Humano;
import t06.ej00.Perro;

public class Main {

	// H 1 Pepe H 1 Pepe H 2 Pepe P 1 10 P 1 10 P 2 10 G A 1 G A 1 G A 2 G B 1
	public static void main(String[] args) {
		
		Collection animales = new LinkedList();
		
		for (int i=0; i<args.length; i += 3) {
			switch (args[i]) {
				case "H":
					Humano h = new Humano( Integer.parseInt( args[i+1] ), args[ i+2 ]);
					animales.add(h);
					;break;
					
				case "G":
					Gato g = new Gato( args[i+1] , Float.parseFloat( args[ i+2 ]));
					animales.add(g);
					;break;
				case "P":
					Perro p = new Perro( Integer.parseInt( args[i+1] ), Float.parseFloat(args[ i+2 ]));
					animales.add(p);
					;break;
			}
		}
		
		System.out.println( animales );
	}

}
