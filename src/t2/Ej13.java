package t2;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		
		int i = 1;
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número n (1..10): ");
		n = scan.nextInt();
		
		while ( i <= 10) {
			System.out.println( n +" x " + i + " = " + ( n * i) );
			i++;
		}
	}

}
