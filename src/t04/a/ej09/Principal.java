package t04.a.ej09;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Introduce n1: ");
		n1 = scan.nextInt();
		
		System.out.println("Introduce n2: ");
		n2 = scan.nextInt();
		
		System.out.println("El máximo de "+n1+ " y "+n2+" es: " + Math.max(n1, n2));
	}
}
