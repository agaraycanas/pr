package pruebas;

import java.util.Scanner;

public class EjercicioExamen1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n=0;
		int[] a = new int[2];
		int i = 0;
		do {
			System.out.print("Introduce un num (>0. 0 para terminar): ");
			n = scan.nextInt();
			System.out.println();
			if ( n%2!=0 && n>0) {
				a[i] = n;
				i++;
			}
		}
		while (n!=0 && i<a.length);
		
		mostrar(a);
		System.out.println("Máximo: "+ max(a));
		System.out.println("Mínimo: "+ min(a));
		System.out.println("Media: "+ media(a));
	}

	private static float media(int[] a) {
		float sumaParcial = 0;
		int i=0;
		while (i<a.length && a[i]!=0) {
			sumaParcial += a[i];
			i++;
		}
		return sumaParcial/i;
	}

	public static int min(int[] a) {
		int numMin=a[0];
		int i=0;
		while (i<a.length && a[i]!=0) {
			if ( a[i]<numMin) {
				numMin = a[i];
			}
			i++;
		}
		return numMin;
	}
	
	public static int max(int[] a) {
		int numMax=0;
		int i=0;
		while (i<a.length && a[i]!=0) {
			if ( a[i]>numMax) {
				numMax = a[i];
			}
			i++;
		}
		return numMax;
	}

	public static void mostrar(int[] a) {
		int i=0;
		while (i<a.length && a[i]!=0 ) {
			System.out.println(a[i] + " ");
			i++;
		}
	}
}
