package t1;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Introduce un número: ");

		int n1;
		n1 = scan.nextInt();

		System.out.println("Introduce otro número: ");

		int n2;
		n2 = scan.nextInt();
		
		System.out.println("La suma de " + n1 + " y " + n2 + " es " + (n1 + n2) );
	}

}
