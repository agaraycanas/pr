package t6.ej12;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import t6.ej00.Humano;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection personas = new HashSet();
		
		personas.add(new Humano(1,"Pepe"));
		personas.add(new Humano(1,"Pepe"));
		personas.add(new Humano(2,"Ana"));
		personas.add(new Humano(3,"Juan"));
		
		System.out.println(personas);
		
		Iterator i = personas.iterator();
		
		System.out.println("Con iterator ===========");

		while (i.hasNext()) {
			Object o = i.next();
			((Humano)o).saludar();
		}
		
		System.out.println("Con for ===========");
		
		for (  Object o :  personas  ) {
			((Humano)o).saludar();
		}
	}

}
