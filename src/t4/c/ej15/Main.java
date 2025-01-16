package t4.c.ej15;

public class Main {

	public static void main(String[] args) {
		String p1 = "perro";
		String p2 = "perra";
		String p3 = "perros";
		String p4 = "perras";
		String p5 = "colibrí";

		System.out.println(p1 + " " + generoYNumero(p1));
		System.out.println(p2 + " " + generoYNumero(p2));
		System.out.println(p3 + " " + generoYNumero(p3));
		System.out.println(p4 + " " + generoYNumero(p4));
		System.out.println(p5 + " " + generoYNumero(p5));
		System.out.println("os" + " " + generoYNumero("os"));

	}

	private static String generoYNumero(String s) {
		String sol = "desconocido";
		
		String ultimaLetra = s.substring(s.length()-1,s.length());
		String dosUltimasLetras = s.substring(s.length()-2,s.length());
		
		switch (ultimaLetra) {
			case "o":sol = "masculino singular";break;
			case "a":sol = "femenino singular";break;
		}

		switch (dosUltimasLetras) {
			case "os":sol = "masculino plural";break;
			case "as":sol = "femenino plural";break;
			}

		/*
		if ( ultimaLetra.equals("o")) {
			sol = "masculino singular";
		}
		else if ( ultimaLetra.equals("a") ) {
			sol = "femenino singular";
		}
		else if ( dosUltimasLetras.equals("os")) {
			sol = "masculino plural";
		}
		else if ( dosUltimasLetras.equals("as")) {
			sol = "femenino plural";
		}
		*/
		return sol;
	}

}
