package t2;

import java.util.Scanner;

public class Ej25 {
	public static boolean esPrimo(long n) {
		boolean primo = true;
		for (long i=2; primo && i<n ; i++) {
			if (n%i == 0) {
				primo = false;
			}
		}
		return primo;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número (0 para terminar): ");
		long numero = scan.nextLong();

		while (numero!=0) {
			String siNo = esPrimo(numero)?" ":" NO ";
			System.out.println(numero + siNo +"es primo");
			System.out.print("Introduce un número (0 para terminar): ");
			numero = scan.nextLong();
		}
		System.out.println("FIN");
	}
}
