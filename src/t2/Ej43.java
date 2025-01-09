package t2;

import java.util.Scanner;

public class Ej43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce t4.a (1..20): ");
		int a = scan.nextInt();

		System.out.println("===============");

		for (int i = a; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < a-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
	}

}
