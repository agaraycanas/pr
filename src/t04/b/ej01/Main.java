package t04.b.ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean terminar = false;
		Scanner scanner = new Scanner(System.in);

		while (!terminar) {
			System.out.print("Introduce un nombre: ");
			String nombre = scanner.nextLine();
			System.out.println();
			if (!nombre.equals("s")) {
				Persona persona;

				if (nombre.equals(".")) {
					persona = new Persona();
				} else {
					persona = new Persona(nombre);
				}
				persona.saludar();
			}
			else {
				terminar=true;
			}
		}
		System.out.println("ADIÓS");
	}

}
