package _pruebas.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(4);
		lista.add(8);
		System.out.println(lista);
		borrar(lista);
		System.out.println(lista);
	}

	private static void borrar(List<Integer> lista) {
		lista.remove(new Integer(4));		
	}

}
