package t09.ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		String nombre = null;

		boolean correcto = true;
		
		do {
			try {
				nombre = obtenerNombre();
				correcto = true;
			} catch (UpperCaseException e) {
				System.out.println(e.getMessage());
				correcto = false;
			}
		}
		while (!correcto);

		System.out.println("Hola " + nombre);
	}

	@SuppressWarnings("resource")
	public static String obtenerNombre() throws UpperCaseException {
		String nombre;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un nombre para saludar: ");
		nombre = scanner.next();
		if (!comienzaPorMayusculas(nombre)) {
			throw new UpperCaseException("El nombre debe comenzar por mayúscula");
		}
		return nombre;
	}

	private static boolean comienzaPorMayusculas(String nombre) {
		char primero = nombre.charAt(0);
		//return Character.isUpperCase(primero);
		 return (primero >=65 && primero <= 90);
	}

}
