package t4.a.ej12;

import java.util.Random;
import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce num. de tiradas: ");
		int nTiradas = scanner.nextInt();
		
		System.out.print("Introduce num. de caras: ");
		int nCaras = scanner.nextInt();

		for (int i=0;i<nTiradas;i++) {
			System.out.println("("+(i+1)+") "+ (random.nextInt(nCaras)+1) );
		}
	}
}
