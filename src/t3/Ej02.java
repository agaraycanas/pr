package t3;

import java.util.Scanner;

public class Ej02 {
	public static int minimo(int[] numeros) {
		int min = numeros[0];
		for (int i=1; i<numeros.length && numeros[i]!=0 ;i++) {
			if ( numeros[i] < min ) {
				min = numeros[i];
			}
		}
		return min;
	}
	//===============================================================
	public static int maximo(int[] numeros) {
		int max = numeros[0];
		for (int i=1; i<numeros.length && numeros[i]!=0 ;i++) {
			if ( numeros[i] > max ) {
				max = numeros[i];
			}
		}
		return max;
	}
	
	//===============================================================

	public static double mediaAritmetica(int[] numeros) {
		double sumaParcial = 0;
		int contador;
		for (contador=0; contador<numeros.length && numeros[contador]!=0 ; contador++) {
			sumaParcial += numeros[contador];
		}
		return (contador!=0?sumaParcial/contador:0);
	}
	
	//===============================================================

	public static void mostrarSinMaxNiMin(int[] n) {
		int max = maximo(n);
		int min = minimo(n);
		
		for (int i=0; i<n.length && n[i]!=0 ; i++) {
			String coma = ", ";
			if ( (n[i] != max) && (n[i] != min) ) {
				System.out.print( ( i==0 ? "" : coma ) + n[i]);
			}
		}
	}


	//===============================================================

	public static void rellenarDatosArray(int[] n) {
		Scanner scan = new Scanner(System.in);
		boolean seguir = true;
		int contador = 1;

		do {
			System.out.print("Introduce n ("+contador+"/"+n.length+"): ");
			n[contador-1] = scan.nextInt();
			contador++;
			seguir = (n[contador-2]!=0) && (contador<=n.length);
		} while (seguir);
	}
	//===============================================================
	
	public static void main(String[] args) {
		final int LIMITE = 30;
		int[] n = new int[LIMITE];

		rellenarDatosArray(n);
		System.out.println("=========================");
		mostrarSinMaxNiMin(n);
		System.out.println();
		System.out.println("La media aritmética es: " + mediaAritmetica(n));
		
	}
}
