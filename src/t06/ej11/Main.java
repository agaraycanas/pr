package t06.ej11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import t06.ej00.Gato;
import t06.ej00.Humano;
import t06.ej00.Perro;

public class Main {

	// H 1 Pepe H 1 Pepe H 2 Pepe P 1 10 P 1 10 P 2 10 G A 1 G A 1 G A 2 G B 1
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Collection animalesAL = new ArrayList();
		Collection animalesLL = new LinkedList();
		Collection animalesHS = new HashSet();
		Collection animalesTS = new TreeSet();
		
		for (int i=0; i<args.length; i += 3) {
			switch (args[i]) {
				case "H":
					Humano h = new Humano( Integer.parseInt( args[i+1] ), args[ i+2 ]);
					animalesAL.add(h);
					animalesLL.add(h);
					animalesHS.add(h);
					//animalesTS.add(h);
					;break;
					
				case "G":
					Gato g = new Gato( args[i+1] , Float.parseFloat( args[ i+2 ]));
					animalesAL.add(g);
					animalesLL.add(g);
					animalesHS.add(g);
					//animalesTS.add(g);
					;break;
				case "P":
					Perro p = new Perro( Integer.parseInt( args[i+1] ), Float.parseFloat(args[ i+2 ]));
					animalesAL.add(p);
					animalesLL.add(p);
					animalesHS.add(p);
					//animalesTS.add(p);
					;break;
			}
		}
		
		System.out.println("============= ORIGINALES =================");
		System.out.println( animalesAL );
		System.out.println( animalesLL );
		System.out.println( animalesHS );
		System.out.println( animalesTS );
		System.out.println("============= ORDENADAS =================");
		//Collections.sort((List)animalesAL);
		//Collections.sort((List)animalesLL);
		//Collections.sort((List)animalesHS); // No se puede porque son Set, no List
		//Collections.sort((List)animalesTS); // No se puede porque son Set, no List
		System.out.println( "AL => " + animalesAL );
		System.out.println( "LL => " +animalesLL );
		System.out.println( "HS => " +animalesHS );
		System.out.println( "TS => " +animalesTS );
	}

}
