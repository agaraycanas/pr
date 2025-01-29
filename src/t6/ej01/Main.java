package t6.ej01;

import t6.ej00.Gato;
import t6.ej00.Humano;
import t6.ej00.Perro;

public class Main {

	// H 1 Pepe   H 2 Juan     G micifú 4.5      P 1 30.8      G nani 8
	public static void main(String[] args) {
		for (int i=0; i<args.length; i += 3) {
			switch (args[i]) {
				case "H": new Humano( Integer.parseInt( args[i+1] ), args[ i+2 ]); break;
				case "G":new Gato( args[i+1] , Float.parseFloat( args[ i+2 ]) ); break;
				case "P":new Perro( Integer.parseInt( args[i+1] ), Float.parseFloat(args[ i+2 ])); break;
			}
			//System.out.println(args[i]);//TODO DEBUG
		}
	}

}
