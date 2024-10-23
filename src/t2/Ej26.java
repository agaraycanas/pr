package t2;

import java.util.Scanner;

public class Ej26 {
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
		for (int i = 2; i <= 100; i++) {
			if (esPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
