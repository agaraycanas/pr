package _pruebas.repasocolecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		//int[] a = { 10,20,30 };
		int[] a1 = new int[3];
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		System.out.println(a1[1]);
		//====================================
		Map< Integer , Integer > a2 = new HashMap<Integer, Integer>();
		a2.put(0,10);
		a2.put(1,20);
		a2.put(2,30);
		System.out.println( a2.get(1) );
		//====================================
		Map< Persona, Coche> a3 = new TreeMap<>();
		//Map< Persona, Coche> a3 = new HashMap<>();
		a3.put(new Persona("Pepe"), new Coche("Seat Ibiza"));
		a3.put(new Persona("Juan García"), new Coche("Ferrari Testarrosa"));
		a3.put(new Persona("Zarrapastroso"), new Coche("Cutre"));
		a3.put(new Persona("Ana Sánchez"), new Coche("Mercedes Benz"));
		a3.put(new Persona("Pepe"), new Coche("Cañón volante"));
		
		mostrar( a3 );
		
	}

	private static void mostrar(Map<Persona, Coche> miMap) {
		for (Persona persona : miMap.keySet()) {
			System.out.println(persona +"\t// " + miMap.get(persona));
		}
	}

}
