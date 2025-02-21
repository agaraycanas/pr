package t02;

import java.util.Scanner;

public class Ej39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n (1..20): ");
		int n = scan.nextInt();
		System.out.println("===============");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
	}

}
