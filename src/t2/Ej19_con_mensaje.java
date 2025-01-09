package t2;

import java.util.Scanner;

public class Ej19_con_mensaje {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anterior;
		int actual;
		boolean numeroIncorrecto = false;

		System.out.print("Introduce un número: ");
		anterior = scan.nextInt();
		actual = anterior;

		if ( anterior != 0) {
			do {
				anterior = actual;
				if (numeroIncorrecto) {
					System.out.print("INCORRECTO: ");
				}
				System.out.print("Introduce otro número superior t4.a " + anterior + ": ");
				int recienLeido = scan.nextInt();
				numeroIncorrecto = (recienLeido <= anterior);
				actual =  (recienLeido > anterior || recienLeido == 0) ? recienLeido : actual; 
			}
			while ( actual != 0 );
		}
		
		System.out.println("FIN");

	}

}
