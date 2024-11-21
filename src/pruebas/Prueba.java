package pruebas;

import java.util.Scanner;

public class Prueba {

	// pedir un número por teclado n (<15)
	// y a continuación pintar las n primeras
	// letras del abecedario
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce n (1..15): ");
		int n= scan.nextInt();
		String[] abecedario = {"A","B","C","D","E","F","G","H","I","J"};
		for (int i=0; i<n ; i++) {
			System.out.print( abecedario[i] +" ");
		}
		
	}

}
