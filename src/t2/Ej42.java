package t2;

import java.util.Scanner;

public class Ej42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce a (1..20): ");
		int a = scan.nextInt();

		System.out.print("Introduce m (1..6): ");
		int m = scan.nextInt();

		System.out.println("===============");

		for (int z = 0; z < m; z++) {

			for (int i = 0; i < a - 1; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = a; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
		System.out.println("===============");
	}

}
