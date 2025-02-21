package t02;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Díme un número: ");
			numero = scan.nextInt();
		} while (numero != 0);
		
		System.out.println("Gracias, adiós");
	}

}
