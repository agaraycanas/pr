package t2;

import java.util.Scanner;

public class Ej41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n (1..20): ");
		int n = scan.nextInt();
		System.out.println("===============");
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============");
	}

}
