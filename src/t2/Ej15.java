package t2;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {

		int i;
		int n = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce n. max: ");
		int numeroDeTablas = scan.nextInt();

		while (n <= numeroDeTablas) {
			i = 1;
			while (i <= 10) {
				System.out.println(n + " x " + i + " = " + (n * i));
				i++;
			}
			System.out.println("======================");
			n = n + 1;
		}

	}

}
