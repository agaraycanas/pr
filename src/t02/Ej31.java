package t02;

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
		long num  = 1 ;
		long den  = (k<(n/2)) ? fact(k) : fact(n-k);
		long cota = (k<(n/2)) ? (n-k+1) : (k+1);
		for (long i=n; i >= cota; i-- ) {
			num = num * i;
		}
		return num/den;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n: ");
		int n = scan.nextInt();
		
		System.out.print("Introduce k: ");
		int k = scan.nextInt();

		System.out.println("[ANT] "+n+" sobre "+k+" = " + comb(n,k) );
		System.out.println(n+" sobre "+k+" = " + comb2(n,k) );
		

	}
}
