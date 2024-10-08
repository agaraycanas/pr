package t1;

import java.util.Scanner;

public class Ej03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dime un nombre: ");
		
		String nombre = scan.nextLine();
		
		System.out.println("Hola " +  nombre );
	}
}
