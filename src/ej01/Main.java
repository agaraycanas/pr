package ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean acabar = false;
		Scanner s = new Scanner(System.in);

		while (!acabar) {
			try {
				System.out.print("Introduce n: ");
				String linea = s.nextLine();
				int n = Integer.parseInt(linea);
				if (n < 0 || n > 100) {
					throw new EdadException();
				}
				System.out.println((n < 18 ? "no " : "") + "eres mayor de edad");
				acabar = true;
				s.close();
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número entero");	
			} catch (EdadException e) {
				System.out.println("La edad debe estar entre 0 y 100");
			}
		}
	}
}
