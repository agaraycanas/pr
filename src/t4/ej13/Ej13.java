package t4.ej13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce num. de tiradas: ");
		int nTiradas = scanner.nextInt();
		
		System.out.print("Introduce num. de caras: ");
		int nCaras = scanner.nextInt();

		for (int i=0;i<nTiradas;i++) {
			System.out.println("("+(i+1)+") "+ ( (int)(Math.random() *  nCaras) +1) );
		}
	}
}
