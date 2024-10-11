package t2;

import java.util.Scanner;

public class Ej03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Díme un número: ");
		numero = scan.nextInt();

		System.out.println("INI");
		if (numero %2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		System.out.println("FIN");
	}
}
