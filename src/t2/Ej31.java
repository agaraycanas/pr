package t2;

import java.util.Scanner;

public class Ej31 {
	
	public static long fact(int n) {
		long acumulado = 1;
		for (long i=2;i<=n;i++) {
			acumulado *= i;
		}
		return acumulado;
	}

	public static long comb(int n,int k) {
		return (  (fact(n) ) / ( fact(k) * fact(n-k)  ) );
	}
	
	public static long comb2(int n,int k) {
		long sol = 1;
		// Hacer aquí el algoritmo optimizado para numeros grandes
		// Observar 2 casos: si k <n/2 ó k>=k/2
		return sol;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n: ");
		int n = scan.nextInt();
		
		System.out.print("Introduce k: ");
		int k = scan.nextInt();

		System.out.println(n+" sobre "+k+" = " + comb(n,k) );
		

	}
}
