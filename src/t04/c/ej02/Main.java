package t04.c.ej02;

public class Main {
	
	public static boolean esLetra(char c) {
		return (c>=65 && c<=90) || (c>=97 && c<=122);		
	}

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
		return esLetra(c) && !esVocal(c);
	}

	public static void main(String[] args) {
		for (char c = 65; c <= 90; c++) {
			System.out.println(c + ": " + (esVocal(c) ? "VOCAL" : "CONSONANTE"));
		}

		System.out.println("========================");
		
		for (char c = 97; c <= 122; c++) {
			System.out.println(c + ": " + (esConsonante(c) ? "CONSONANTE" : "VOCAL"));
		}
		System.out.println("====================================");
		System.out.println(esVocal(']'));
		System.out.println(esConsonante(']'));
	}
}