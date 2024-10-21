package t2;

import java.util.Scanner;

public class Ej24 {
	
	public static int sumaDigitosImpar(int numero) {
		int solucion = 0;
		boolean acumular = true; // false para calcular suma de dígitos pares
		
		while (numero!=0) {
			if (acumular) {
				solucion += (numero%10);
			}
			acumular = !acumular; // invierte el sentido de la acumulación para el siguiente bucle
			numero /= 10;
		}
		
		return solucion;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();
		
		int sdi = sumaDigitosImpar(numero);
		System.out.println("La suma de los dígitos de "+numero+" es "+ sdi);
		/*
		int x1 = 123; 	// 4
		int x2 = 10283; // 6 
		int x3 = 129973;// 14
		int x4 = 1234; // 6
		
		System.out.println("Suma de "+x1+" es "+sumaDigitosImpar(x1)); // 123		4
		System.out.println("Suma de "+x2+" es "+sumaDigitosImpar(x2)); // 10283		6
		System.out.println("Suma de "+x3+" es "+sumaDigitosImpar(x3)); // 129973	14
		System.out.println("Suma de "+x4+" es "+sumaDigitosImpar(x4)); // 1234		6
		*/
	}
}
