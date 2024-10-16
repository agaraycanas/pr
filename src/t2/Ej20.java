package t2;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();

		int dividendo = numero;
		int divisor = 10;
		int cociente = numero;
		int resto;
		
		int sumaParcial = 0;
		String stringParcial = "";

		// MOSTRAR EL NUMERO INVERSO de numero
		while (dividendo != 0) {
			dividendo = cociente;
			cociente = dividendo / divisor;
			resto = dividendo % divisor;
			if ( ! (cociente == 0 && resto== 0) ) {
				//System.out.print(resto);
				sumaParcial = sumaParcial*10 + resto;
				stringParcial = stringParcial + resto;
			}
		}

		System.out.println("El número inverso es : "+sumaParcial);
		System.out.println("El string inverso es : "+stringParcial);
	}

}
