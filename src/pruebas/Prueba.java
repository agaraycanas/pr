package pruebas;

import java.util.Scanner;

class Prueba {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Se pueden repetir los elementos (s/n): ");
		String cadena = scan.nextLine();
		
		if (cadena.equals("s")) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}
	}
}