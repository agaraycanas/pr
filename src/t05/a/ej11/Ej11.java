package t05.a.ej11;

import java.util.Random;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce num. de tiradas: ");
		int nTiradas = scanner.nextInt();
		
		for (int i=0;i<nTiradas;i++) {
			System.out.println("("+(i+1)+")"+ (random.nextInt(6)+1) );
		}
	}
}
