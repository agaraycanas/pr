package t2;

import java.util.Scanner;

public class Ej05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce una letra: ");
		String letra = scan.nextLine();

		System.out.println("=================INI================");
		switch (letra) {
		case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
			System.out.println("vocal");
			break;
		default:
			System.out.println("consonante");
			break;
		}
		System.out.println("=================FIN================");
	}
}