package t078.ej13;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import t078.ej00.Gato;
import t078.ej00.Humano;
import t078.ej00.Perro;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection mascotas = new HashSet();
		
		mascotas.add(new Perro(1,10f));
		mascotas.add(new Gato("Micifu",10));
		mascotas.add(new Perro(1,20f));
		mascotas.add(new Gato("Micifu",10));
		
		mascotas.add(new Perro(2,20f));
		mascotas.add(new Perro(3,30f));
		mascotas.add(new Gato("Micifu",20));
		mascotas.add(new Gato("Cuki",10));
		
		System.out.println(mascotas);
		
		Iterator i = mascotas.iterator();
		
		System.out.println("Con iterator ===========");

		while (i.hasNext()) {
			Object o = i.next();
			if ( o instanceof Perro) {
				((Perro)o).saludar();
			}
			if ( o instanceof Gato) {
				((Gato)o).saludar();
			}

		}
		
		System.out.println("Con for ===========");
		
		for (  Object o :  mascotas  ) {
			if ( o instanceof Perro) {
				((Perro)o).saludar();
			}
			if ( o instanceof Gato) {
				((Gato)o).saludar();
			}
		}
	}

}
