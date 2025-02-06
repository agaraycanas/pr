package t6.ej14;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import t6.ej00.Gato;
import t6.ej00.Humano;
import t6.ej00.Perro;

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
		
		mascotas.add(new Humano(10,"Pepe"));

		mascotas.add(new Perro(10,100f));
		
		System.out.println(mascotas);
		
		for (  Object o :  mascotas  ) {
			if ( o instanceof Perro) {
				((Perro)o).saludar();
			}
			if ( o instanceof Gato) {
				((Gato)o).saludar();
			}
			/* Es lo que habría que hacer para
			 * que saludara el humano también
			 
			if ( o instanceof Humano) {
				((Humano)o).saludar();
			}
			*/
		}
	}

}
