package t03;

import java.util.Arrays;

public class Ej11 {

	public static void main(String[] args) {
		int[] original = { 10, 4, 5, -6, 7, 1, 9 };
		System.out.println("t04.a \t\t= " + Arrays.toString(original));
		int[] ordenado = burbuja(original);
		System.out.println("t04.a(ordenado)\t= " + Arrays.toString(ordenado));
	}

	public static int[] clonar(int[] a) {
		int[] nuevo;
		nuevo = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			nuevo[i] = a[i];
		}
		return nuevo;
	}

	public static int[] burbuja(int[] original) {
		int[] copia = clonar(original);
		System.out.println(Arrays.toString(copia));

		for (int limite = copia.length - 2; limite >= 0; limite--) {
			for (int i = 0; i <= limite; i++) {
				if (copia[i] > copia[i + 1]) {
					swap(copia, i, i + 1);
				}
				System.out.println(Arrays.toString(copia));
			}
		}
		return copia;
	}

	public static void swap(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

}
