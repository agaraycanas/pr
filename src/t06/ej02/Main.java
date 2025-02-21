package t06.ej02;

import t06.ej00.Gato;
import t06.ej00.Humano;
import t06.ej00.Perro;

public class Main {
	// H 1 Pepe H 2 Juan G micifú 4.5 P 1 30.8 G nani 8
	public static void main(String[] args) {
		for (int i=0; i<args.length; i += 3) {
			switch (args[i]) {
				case "H":
					System.out.println(
					new Humano( Integer.parseInt( args[i+1] ), args[ i+2 ])
					)
					;break;
					
				case "G":
					System.out.println(
					new Gato( args[i+1] , Float.parseFloat( args[ i+2 ]))
					)
					;break;
				case "P":
					System.out.println(
					new Perro( Integer.parseInt( args[i+1] ), Float.parseFloat(args[ i+2 ])) 
					)
					;break;
			}
		}
	}
}
