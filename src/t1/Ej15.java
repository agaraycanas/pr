package t1;

import java.util.Scanner;

public class Ej15 {
	public static int maximo(int n1, int n2) {
		return    (n1>n2) ?   n1  :  n2    ;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Dame otro número: ");
		int n2 = scan.nextInt();
		
		System.out.println( "El máximo de " + n1 + " y " + n2 + " es " + maximo(n1,n2) );

	}
}
