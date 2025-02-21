package t02;

import java.util.Scanner;

public class Ej22 {
	
	public static boolean esCapicua( int numero ) {
		return (numero  == inverso(numero));
	}

	public static int inverso(int numero) {
		int numeroInverso = 0;

		while (numero != 0) {
			numeroInverso = numeroInverso*10 + numero % 10;
			numero /= 10 ;
		}
		return numeroInverso;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scan.nextInt();
		String siNo = esCapicua(numero) ? "" : "no" ;
		System.out.println("El número " +  numero +" "+ siNo + " es capicúa");
	}

}
