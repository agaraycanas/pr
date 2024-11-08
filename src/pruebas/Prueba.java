package pruebas;

import java.util.Arrays;

public class Prueba {

	public static int[] clonar(int[] a) {
		int[] nuevo;
		nuevo = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			nuevo[i] = a[i];
		}
		return nuevo;
	}

	public static void swap(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public static int[] burbuja(int[] o) {
		int[] c = clonar(o); // "c" de copia, "o" de original

		for (int limite = c.length - 2; limite >= 0; limite--) {
			for (int i = 0; i <= limite; i++) {
				if (c[i] > c[i + 1]) {
					swap(c, i, i + 1);
				}
			}
			System.err.println(Arrays.toString(c));
		}
		return c;
	}

	public static void main(String[] args) {
		int[] original = { 2, 1, 9, -5, 7 };
		int[] ordenado = burbuja(original);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(ordenado));
	}
}