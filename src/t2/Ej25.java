package t2;

import java.util.Scanner;

public class Ej25 {
	public static boolean esPrimo(int n) {
		boolean primo = true;
		return primo;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número (0 para terminar): ");
		int numero = scan.nextInt();

		while (numero!=0) {
			String siNo = esPrimo(numero)?" ":" no ";
			System.out.println(numero + siNo +"es primo");
			System.out.print("Introduce un número (0 para terminar): ");
			numero = scan.nextInt();
		}
		System.out.println("FIN");
	}
}
