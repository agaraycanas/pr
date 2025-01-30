package t6.ej04;

import t6.ej00.Gato;
import t6.ej00.Humano;
import t6.ej00.Perro;

public class Main {
	public static void main(String[] args) {

		Humano h1 = new Humano(1, "Pepe");
		Humano h2 = new Humano(1, "Pepe");
		Humano h3 = new Humano(2, "María");

		System.out.println("h1 ?? h2 " + h1.compareTo(h2)); // 0
		System.out.println("h1 ?? h3 " + h1.compareTo(h3)); // -1 (<0)
		System.out.println("h2 ?? h3 " + h3.compareTo(h2)); // 1 (>0)

		Perro p1 = new Perro(1, 20);
		Perro p2 = new Perro(1, 20);
		Perro p3 = new Perro(2, 50);

		System.out.println("p1 ?? p2 " + p1.compareTo(p2)); // 0
		System.out.println("p1 ?? p3 " + p1.compareTo(p3)); // -1 (<0)
		System.out.println("p2 ?? p3 " + p3.compareTo(p2)); // 1 (>0)

		Gato g1 = new Gato("A", 20);
		Gato g2 = new Gato("A", 20);
		Gato g3 = new Gato("A", 50);

		System.out.println("g1 ?? g2 " + g1.compareTo(g2)); // 0
		System.out.println("g1 ?? g3 " + g1.compareTo(g3)); // 1 (>0)
		System.out.println("g2 ?? g3 " + g3.compareTo(g2)); // -1 (<0)
		
		// Comparaciones inter - especie
		
		System.out.println("h1 ?? p1 " + h1.compareTo(p1)); // 1 (>0)
		System.out.println("h1 ?? g1 " + h1.compareTo(g1)); // 1 (>0)
		System.out.println("p1 ?? g1 " + p1.compareTo(g1)); // 1 (<0)
		
	}
}
