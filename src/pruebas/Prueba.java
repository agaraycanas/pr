package pruebas;

import java.util.Scanner;

public class Prueba {

	// pedir un número por teclado n (<15)
	// y a continuación pintar las n primeras
	// letras del abecedario
	public static void main(String[] args) {
		System.out.print("Introduce cadena: ");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		System.out.println("A: "+a+" // B: "+ b+" // C: " + c);
	}

}
