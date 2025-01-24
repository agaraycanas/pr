package _pruebas.comparaciones;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Cosa c1 = new Cosa(50);
		Cosa c2 = new Cosa(100);
		Random r = new Random();
		
		String s1 = "";
		String s2 = "";
		
		//if (c1>c2) {
		if ( c1.compareTo(c2) > 0 ) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}
	}

}
