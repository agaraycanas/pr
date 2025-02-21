package t02;

import java.util.Scanner;

public class Ej28 {

	public static int mcd(int grande, int peque) {
		if (grande < peque) {
			int aux = grande;
			grande = peque;
			peque = aux;
		}
		while (peque != 0) {
			int grandeDeAntes = grande;
			grande = peque;
			peque = grandeDeAntes % peque;
		}
		return grande;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce x: ");
		int x = scan.nextInt();

		System.out.print("Introduce y: ");
		int y = scan.nextInt();

		System.out.println("El mcd de " + x + "," + y + " es " + mcd(x,y) );
	}

}
