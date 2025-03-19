package t10.ej23;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		cartas.add(new Carta(1,"bastos"));
		cartas.add(new Carta(1,"oros"));
		cartas.add(new Carta(3,"bastos"));
		cartas.add(new Carta(11,"espadas"));
		Arrays.sort(cartas.toArray());
		System.out.println(cartas);
	}
	

}
