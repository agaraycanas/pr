package t2;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anterior;
		int actual;

		System.out.print("Introduce un número: ");
		anterior = scan.nextInt();

		System.out.print("Introduce otro número: ");
		actual = scan.nextInt();

		while (actual > anterior) {
			anterior = actual;
			System.out.print("Introduce otro número: ");
			actual = scan.nextInt();
		} ;

		System.out.println("FIN");

	}

}
