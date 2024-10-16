package t2;

import java.util.Scanner;

public class Ej19__sin_mensaje {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anterior;
		int actual;

		System.out.print("Introduce un número: ");
		anterior = scan.nextInt();
		actual = anterior;

		if ( anterior != 0) {
			do {
				anterior = actual;
				System.out.print("Introduce otro número superior a " + anterior + ": ");
				int recienLeido = scan.nextInt();
				actual =  (recienLeido > anterior || recienLeido == 0) ? recienLeido : actual; 
			}
			while ( actual != 0 );
		}
		
		System.out.println("FIN");

	}

}
