package t4.c.ej02;

public class Main {

	public static boolean esVocal(char c) {
		boolean sol = false;
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			sol = true;
		}
		return sol;
	}

	public static boolean esConsonante(char c) {
		return !esVocal(c); // Devuelve que un carácter raro como un paréntesis es una consonante
	}

	public static void main(String[] args) {
		for (char c = 65; c <= 122; c++) {
			System.out.println(c + ": " + (esVocal(c) ? "VOCAL" : ""));
			System.out.println(c + ": " + (esConsonante(c) ? "CONSONANTE" : ""));
		}
	}
}