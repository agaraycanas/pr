package t02;

import java.util.Scanner;

public class Ej20_alternativo_suma_parcial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int sumaParcial = 0;
		
		do {
			System.out.print("Introduce un número (sp="+ sumaParcial + "): ");
			numero = scan.nextInt();
			sumaParcial = sumaParcial + numero;
		}
		while (numero != 0);
		
		System.out.println("La suma es total es " + sumaParcial);
	}
}
