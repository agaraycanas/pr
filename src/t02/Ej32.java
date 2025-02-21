package t02;

import java.util.Scanner;

public class Ej32 {

	public static long serie(int num) {
		long xi = 1;
		
		for (int i=2; i<=num; i++) {
			xi = xi * 3;
		}

		return xi;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("n: ");
		int n = s.nextInt(); // Aquí bastaría con poner int n = 5; y quitar las dos líneas anteriores
		
		System.out.println("Los "+n+" primeros términos de la serie son: ");
		for (int i=1 ; i<=n; i++) {
			long xi = serie(i);
			System.out.print("["+i+"]"+xi+" ");
		}
		
	}
}
