package t02;

import java.util.Scanner;

public class Ej04b {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Díme un número: ");
		numero = scan.nextInt();

		System.out.println("========== INI ============");
		
		switch (numero) {
			case 3:  System.out.println("TRES"); break;
			case 1:  System.out.println("UNO"); break;
			case 2:  System.out.println("DOS"); break;
			default: System.out.println("NO SÉ"); break;
		}
		
		System.out.println("========== FIN ============");
	}
}
