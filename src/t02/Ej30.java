package t02;

import java.util.Scanner;

public class Ej30 {
	
	public static long fact(int n) {
		long acumulado = 1;
		for (long i=2;i<=n;i++) {
			acumulado *= i;
		}
		return acumulado;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n ( 0 <= n < 21 ): ");
		int n = scan.nextInt();
		
		System.out.println(n+"! = "+fact(n));
		

	}
}
