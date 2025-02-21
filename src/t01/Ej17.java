package t01;

import java.util.Scanner;

public class Ej17 {
	public static boolean par( int n ) {
		return (n % 2) == 0; 
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n = scan.nextInt();
		
		System.out.println("El número es "+ ( par(n) ? "par" : "impar" ));
	}
}
