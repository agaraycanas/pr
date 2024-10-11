package t2;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce cota inferior: ");
		int cotaInferior = scan.nextInt();

		System.out.print("Introduce cota superior: ");
		int cotaSuperior = scan.nextInt();

		int i = (cotaInferior %2 == 1) ? cotaInferior : cotaInferior+1;
		
		/*
		 * Código equivalente al ternario anterior
		 * 
		if (cotaInferior %2 == 1) {
			i = cotaInferior;
		}
		else {
			i = cotaInferior+1;
		}
		*/
		
		while ( i <= cotaSuperior ) {
			System.out.print(i + " ");
			i = i + 2;
		}
	}
}
