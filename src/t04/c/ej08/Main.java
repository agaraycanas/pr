package t04.c.ej08;

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
	
	public static boolean esMayuscula(char c) {
		return (c>=65 && c<=90);
	}

	public static int numVocales(String cadena) {
		int n=0;
		for (int i=0;i<cadena.length();i++) {
			if (esVocal(cadena.charAt(i))) {
				n++;
			}
		}
		return n;
	}
	
	public static int numMayusculas(String cadena) {
		int n=0;
		for (int i=0;i<cadena.length();i++) {
			if (esMayuscula(cadena.charAt(i))) {
				n++;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		String palabra = "AaEe>vf";
		System.out.println(numVocales(palabra));
	}

}
