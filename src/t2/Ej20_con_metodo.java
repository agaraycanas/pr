package t2;

import java.util.Scanner;

public class Ej20_con_metodo {

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
		
		int ni = inverso(numero);
		System.out.println("El número inverso es : " +  ni );
	}

}
