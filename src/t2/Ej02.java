package t2;

import java.util.Scanner;

public class Ej02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int edad;
		int numero;

		System.out.print("Díme tu edad: ");
		edad = scan.nextInt();

		System.out.print("Díme un número: ");
		numero = scan.nextInt();

		if (numero > edad) {
			System.out.println("Viejales");
		} else if (numero < edad) {
			System.out.println("Demasiado joven");
		} else {
			System.out.println("Buena edad");
		}
		System.out.println("FIN");
	}
}
