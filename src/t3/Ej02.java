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

	public static int mediaAritmetica(int[] numeros) {
		int sumaParcial = 0;
		int contador;
		for (contador=0; contador<numeros.length && numeros[contador]!=0 ; contador++) {
			sumaParcial += numeros[contador];
		}
		return (contador!=0?sumaParcial/contador:0);
	}
	
	//===============================================================
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean seguir = true;
		int contador = 1;
		final int LIMITE = 30;
		int[] n = new int[LIMITE];
		
		do {
			System.out.print("Introduce n ("+contador+"/"+LIMITE+"): ");
			n[contador-1] = scan.nextInt();
			contador++;
			seguir = (n[contador-2]!=0) && (contador<=LIMITE);
		} while (seguir);
		
		System.out.println("=========================");
		
		for (int i=0; i<LIMITE && n[i]!=0 ; i++) {
			String coma = ", ";
			System.out.print( ( i==0 ? "" : coma ) + n[i]);
		}
		
		System.out.println();
		System.out.println("El máximo es: " + maximo(n));
		System.out.println("El mínimo es: " + minimo(n));
		System.out.println("La media aritmética es: " + mediaAritmetica(n));
		
	}
}
