package t078.ej15;

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
		mascotas.add(new Perro(1, 20f));
		mascotas.add(new Gato("Micifu", 10));

		mascotas.add(new Perro(2, 20f));
		mascotas.add(new Perro(3, 30f));
		mascotas.add(new Gato("Micifu", 20));
		mascotas.add(new Gato("Cuki", 10));

		mascotas.add(new Perro(10, 100f));

		//mascotas.add(new Humano(1,"Pepe"));

		System.out.println(mascotas);

		for (Object o : mascotas) {
				((Mascota) o).saludar();
		}
	}
}
