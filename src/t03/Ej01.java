package t03;

import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean seguir = true;
		int contador = 1;
		final int LIMITE = 30;
		int[] n = new int[LIMITE];
		
		do {
			System.out.print("Introduce n ("+contador+"/"+LIMITE+"): ");
			n[contador-1] = scan.nextInt();
			contador++;
			seguir = (n[contador-2]!=0) && (contador<=LIMITE);
		} while (seguir);
		
		System.out.println("=========================");
		
		for (int i=0; i<LIMITE && n[i]!=0 ; i++) {
			String coma = ", ";
			System.out.print( ( i==0 ? "" : coma ) + n[i]);
		}
		
	}
}
