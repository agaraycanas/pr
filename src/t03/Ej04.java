package t03;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		final int tamanyo = 10;
		Scanner scan = new Scanner(System.in);
		String[] palabras = new String[tamanyo];
		String palabra;

		int i = 0;
		do {
			System.out.print("Palabra " + (i+1) + ": ");
			palabra = scan.next();
			if (!palabra.equals("FIN")) {
				palabras[i] = palabra;
				i++;
			}
		} while (!palabra.equals("FIN") && i < palabras.length);

		System.out.println("================");
		System.out.print("Contenido del array: ");
		System.out.println(convertirAString(palabras));
		System.out.println("================");
		System.out.print("Palabra secreta: ");
		System.out.println(extraerPrimeraLetra(palabras));
	}

	public static String convertirAString(String[] a) {
		String cadenaADevolver = "(";
		for (int i = 0; i < a.length && a[i] != null; i++) {
			cadenaADevolver = cadenaADevolver + a[i];
			if (i != a.length - 1 && a[i + 1] != null) {
				cadenaADevolver = cadenaADevolver + ", ";
			}
		}
		cadenaADevolver = cadenaADevolver + ")";
		return cadenaADevolver;
	}

	public static String extraerPrimeraLetra(String[] a) {
		String cadenaADevolver = "";
		for (int i = 0; i < a.length && a[i] != null; i++) {
			cadenaADevolver +=  a[i].charAt(0);
		}
		return cadenaADevolver;
	}
}
