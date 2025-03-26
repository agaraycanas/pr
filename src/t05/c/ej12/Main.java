package t05.c.ej12;

public class Main {

	public static char aMayuscula(char c) {
		char sol = c;
		if (c>=97 && c<=122) {
			sol -= 32;
		}
		return sol;
	}
	
	public static String charAMay(String s ,char c) {
		String sol = "";
		for (int i=0;i<s.length();i++) {
			char caracter = s.charAt(i)!=c ? s.charAt(i) : aMayuscula(c) ;
			sol += caracter;
		}
		return sol;
	}
	
	public static void main(String[] args) {
		String cadena = "AaBbCcaa";
		System.out.println(charAMay(cadena, 'a')); // AABbCcAA
	}

}
