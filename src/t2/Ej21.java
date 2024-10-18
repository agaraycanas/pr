package t2;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número positivo: ");

		int numero = scan.nextInt();
		int numeroOriginal = numero;
		int numeroDeCifras = 0;

		while (numero != 0) {
			numero = numero / 10;
			numeroDeCifras++;
		}

		System.out.println(numeroOriginal + " tiene " + numeroDeCifras + " cifras");
	}

}
