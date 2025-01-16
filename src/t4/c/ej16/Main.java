package t4.c.ej16;

public class Main {

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
	
	public static String quitaTildes(String frase) {
		String sol="";
		for (int i=0; i<frase.length();i++) {
			char c = frase.charAt(i);
			sol += quitaTilde(c);
		}
		return sol;
	}
	
	public static void main(String[] args) {
		String[] palabra = { 
				"Ángel", "váter", 
				"Écija", "éstasis", 
				"Íntegro", "París",
				"Caló", "Ósmosis",
				"Milú", "Ú-no se me ocurre"
				};
		
		for (int i=0;i<palabra.length;i++) {
			System.out.println(palabra[i] + " => " +  quitaTildes(palabra[i]));
		}

	}

}
