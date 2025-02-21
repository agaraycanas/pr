package t02;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anterior;
		int actual;

		// ============== WHILE ===========
		/*
		System.out.print("Introduce un número: ");
		anterior = scan.nextInt();

		System.out.print("Introduce otro número: ");
		actual = scan.nextInt();

		while (actual > anterior) {
			anterior = actual;
			System.out.print("Introduce otro número: ");
			actual = scan.nextInt();
		} ;
		*/
		
		// =========== DO WHILE ===========
		System.out.print("Introduce un número: ");
		anterior = scan.nextInt();
		actual = anterior;

		if ( anterior != 0) {
			do {
				anterior = actual;
				System.out.print("Introduce otro número: ");
				actual = scan.nextInt();
			}
			while ( actual != 0 && actual > anterior);
		}
		
		System.out.println("FIN");

	}

}
