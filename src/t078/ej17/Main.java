package t078.ej17;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import t078.ej00.Gato;
import t078.ej00.Humano;
import t078.ej00.Mascota;
import t078.ej00.Perro;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection mascotas = new HashSet();

		mascotas.add(new Perro(1, 10f));
		mascotas.add(new Gato("Micifu", 10));
		mascotas.add(new Perro(2, 20f));
		mascotas.add(new Perro(3, 30f));
		mascotas.add(new Gato("Garfield", 20));
		mascotas.add(new Gato("Cuki", 10));
		mascotas.add(new Gato("gatuno", 10));

		System.out.println(mascotas);

		for (Object o : mascotas) {
			if ( o instanceof Perro ||  ((Gato)o).getNombre().charAt(0)!='G' && ((Gato)o).getNombre().charAt(0)!='g' )  { 
				// Sea un perro o bien sea un gato pero que no empiece por "G" su nombre
				((Mascota) o).saludar();
			}
		}
	}
}
