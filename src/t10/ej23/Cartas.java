package t10.ej23;

import java.util.Random;

public class Cartas {
	public static Carta azar() {
		String[] palo = { "oros", "copas", "espadas", "bastos" };
		Random r = new Random();
		int numero = 8;
		while (numero==8 || numero==9) {
			numero = r.nextInt(12)+1;
		}
		int numPalo = r.nextInt(4);
		return new Carta(numero, palo[numPalo]);
	}
}
