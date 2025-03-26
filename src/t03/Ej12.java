package t03;

import java.util.Arrays;

public class Ej12 {

	public static void main(String[] args) {

		int[] original = convertir(args);

		System.out.println("t05.a \t\t= " + Arrays.toString(original));
		int[] ordenado = burbuja(original);
		System.out.println("t05.a(ordenado)\t= " + Arrays.toString(ordenado));
	}

	public static int[] convertir(String[] args) {
		int[] arrayADevolver = new int[args.length];
		for (int i = 0; i < arrayADevolver.length; i++) {
			arrayADevolver[i] = Integer.parseInt(args[i]);
		}
		return arrayADevolver;
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

		for (int limite = copia.length - 2; limite >= 0; limite--) {
			for (int i = 0; i <= limite ; i++) {
				if (copia[i] > copia[i + 1]) {
					swap(copia, i, i + 1);
				}
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
