package t1;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un nombre: ");
		String nombre = scan.nextLine();

		System.out.println("Introduce tu edad: ");
		byte edad = scan.nextByte();
		
		String madurez = (edad < 18) ? "menor" : "mayor";
		System.out.println(nombre + ", eres " + madurez + " de edad");
	}

}
