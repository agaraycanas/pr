package t2;

import java.util.Scanner;

public class Ej30 {
	
	public static long fact(int n) {
		long sol = 1;
		for (long i=2;i<=n;i++) {
			sol *= i;
		}
		return sol;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n ( 0 <= n <= 21 ): ");
		int n = scan.nextInt();
		
		System.out.println(n+"! = "+fact(n));
		

	}
}
