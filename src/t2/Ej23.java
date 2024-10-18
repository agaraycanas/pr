package t2;

import java.util.Scanner;

public class Ej23 {
	
	public static int sumaDigitos(int numero) {
		int solucion = 0;
		while (numero!=0) {
			solucion += (numero%10);
			numero /= 10;
		}
		
		return solucion;
	}
	
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();
		
		int sd = sumaDigitos(numero);
		System.out.println("La suma de los dígitos de "+numero+" es "+ sd);
		*/
		int x1 = 123;
		int x2 = 10283;
		int x3 = 129973;
		
		System.out.println("Suma de "+x1+" es "+sumaDigitos(x1));
		System.out.println("Suma de "+x2+" es "+sumaDigitos(x2));
		System.out.println("Suma de "+x3+" es "+sumaDigitos(x3));
	}
}
