package t04.c.ej17;

public class Main {

	// Reciclado del Ej.16
	public static char quitaTilde(char c) {
		char sol=c;
		switch (c) {
			case 'á':sol='a';break;
			case 'é':sol='e';break;
			case 'í':sol='i';break;
			case 'ó':sol='o';break;
			case 'ú':sol='u';break;
			case 'Á':sol='A';break;
			case 'É':sol='E';break;
			case 'Í':sol='I';break;
			case 'Ó':sol='O';break;
			case 'Ú':sol='U';break;
		}
		return sol;
	}
	
	// Reciclado del Ej.16
	public static String quitaTildes(String frase) {
		String sol="";
		for (int i=0; i<frase.length();i++) {
			char c = frase.charAt(i);
			sol += quitaTilde(c);
		}
		return sol;
	}

	// Reciclado del Ej.10
	public static String quitaEspacios(String s) {
		String sol = "";
		for (int i=0;i<s.length();i++) {
			if ( s.charAt(i) != ' ') {
				sol += s.charAt(i);
			}
		}
		return sol;
	}
	
	// Reciclado del Ej 11
	public static String reves (String s) {
		String sol = "";
		for (int i=0;i<s.length();i++) {
			sol = s.charAt(i) + sol;
		}
		return sol;
	}
	
	private static boolean esPalindromo(String original) {
		String f1 = original;
		String f2 = reves(original);
		f1 = quitaTildes(quitaEspacios(f1.toLowerCase()));
		f2 = quitaTildes(quitaEspacios(f2.toLowerCase()));
		return f1.equals(f2);
		/* ... también funcionaría este otro, pero sería más ilegible
		return 	quitaTildes(
					quitaEspacios(
							original.toLowerCase())).equals(
				quitaTildes(
					quitaEspacios(
							reves(original).toLowerCase())));
		*/
	}

	public static void main(String[] args) {
		String[] frase = {
				"Arriba la birra",
				"Átale demoníaco Caín o me delata",
				"Eva se lame mal es ave",
				"Esto no es un palíndromo",
				"Y esta frase tampoco",
				"No quiero decir nada de esta otra",
				"Roma ni se conoce sin oro ni se conoce sin amor"
		};
		
		for (int i=0;i<frase.length;i++) {
			System.out.println( (esPalindromo(frase[i])?"Sí: ":"No: ") + frase[i] );
		}
	}


}
