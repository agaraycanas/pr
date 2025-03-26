package t02;

import java.util.Scanner;

public class Ej05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce una letra: ");
		String letra = scan.nextLine();

		System.out.println("=================INI================");
		switch (letra) {
		case "t05.a", "e", "i", "o", "u", "Persona", "E", "I", "O", "U":
			System.out.println("vocal");
			break;
		default:
			System.out.println("consonante");
			break;
		}
		System.out.println("=================FIN================");
	}
}