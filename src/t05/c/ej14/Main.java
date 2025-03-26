package t05.c.ej14;

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
	
	private static String vocalizacion(String frase, char sustituto) {
		String sol = "";
		for (int i=0; i<frase.length(); i++) {
			char c = frase.charAt(i);
			sol += esVocal(c) ? sustituto : c;
		}
		return sol;
	}
	
	
	public static void main(String[] args) {
		String frase = "Qué DIFÍCIL es LEER las FRASES sin VOCALES";
		char c = '-';
		System.out.println(vocalizacion(frase,c));
	}



}
