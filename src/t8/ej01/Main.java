package t8.ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un nombre para saludar: ");
		
		String nombre = scanner.next();
		
		System.out.println("Hola " + nombre);
	}

}
