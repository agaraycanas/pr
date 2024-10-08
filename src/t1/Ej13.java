package t1;

import java.util.Scanner;

public class Ej13 {

	public static int doble(int x) {
		return 2*x;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un número: ");
		int n = scan.nextInt();
		
		System.out.println( "El doble de "+ n + " es " + doble(n) );
	}

}
