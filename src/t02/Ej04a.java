package t02;

import java.util.Scanner;

public class Ej04a {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Díme un número: ");
		numero = scan.nextInt();

		System.out.println("========== INI ============");
		
		if (numero == 3) {
			System.out.println("TRES");
		}
		else if (numero==1) {
			System.out.println("UNO");
		}
		else if (numero ==2) {
			System.out.println("DOS");
		}
		else {
			System.out.println("NO SÉ");
		}
		
		System.out.println("========== FIN ============");
	}
}
