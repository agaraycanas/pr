package t04.c.ej13;

public class Main {
	public static boolean esVocal(char c) {
		boolean sol = false;
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'ü':
		case 'á':
		case 'é':
		case 'í':
		case 'ó':
		case 'ú':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'Ü':
		case 'Á':
		case 'É':
		case 'Í':
		case 'Ó':
		case 'Ú':
			sol = true;
		}
		return sol;
	}
	
	public static char aMayuscula(char c) {
		char sol = c;
		if ( (c>=97 && c<=122) || (c>=225 && c<=255) ){
			sol -= 32;
		}
		return sol;
	}

	public static String vocalAMay(String frase) {
		String sol ="";
		for (int i=0; i<frase.length(); i++) {
			char c = frase.charAt(i);
			sol +=  ( esVocal(c) ?  aMayuscula(c) : c );
		}
		return sol;
	}
	
	public static void main(String[] args) {
		String frase = "a ver si pone en mayúscula todas las vocales: pingüino, ";
		System.out.println(vocalAMay(frase));
	}

}
