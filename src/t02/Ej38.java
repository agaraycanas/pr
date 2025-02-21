package t02;

import java.util.Scanner;

public class Ej38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n (1..20): ");
		int n= scan.nextInt();
		
		for (int i=0;i<n ;i++) {
			System.out.print("*");
		}
	}

}
