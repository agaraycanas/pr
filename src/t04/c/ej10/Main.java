package t04.c.ej10;

public class Main {

	public static String quitaEspacios(String s) {
		String sol = "";
		for (int i=0;i<s.length();i++) {
			if ( s.charAt(i) != ' ') {
				sol += s.charAt(i);
			}
		}
		return sol;
	}
	public static void main(String[] args) {
		String cadena = "En un lugar de La Mancha de cuyo nombre no quiero acordarme";
		System.out.println(quitaEspacios(cadena));
	}

}
