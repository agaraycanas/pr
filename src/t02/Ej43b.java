package t02;

import java.util.Scanner;

public class Ej43b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce t04.a (1..20): ");
		int a = scan.nextInt();

		System.out.println("===============");
		int ne = a-1;
		int na = 1;
		
		for (int i = 0; i < a; i++) {
			for (int es=0; es<ne; es++) {
				System.out.print(" ");
			}
			for (int as=0; as<na; as++) {
				System.out.print("*");
			}
			System.out.println();
			ne--;
			na++;
		}
		System.out.println("===============");
	}

}
