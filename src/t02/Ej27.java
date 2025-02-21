package t02;

import java.util.Scanner;

public class Ej27 {
	public static boolean esPrimo(long n) {
		boolean primo = true;
		for (long i = 2; primo && i < n; i++) {
			if (n % i == 0) {
				primo = false;
			}
		}
		return primo;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Dime un número t04.a: ");
		a = s.nextInt();
		
		System.out.println("Dime un número b (mayor o igual que t04.a): ");
		b = s.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (esPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
