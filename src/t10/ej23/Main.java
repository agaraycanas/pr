package t10.ej23;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Carta> cartas = inicializarCartas();
		List<Jugador> jugadores = inicializarJugadores();
		repartir(cartas,jugadores);
	}

	private static void repartir(ArrayList<Carta> cartas, List<Jugador> jugadores) {
		for (  Jugador jugador : jugadores ) {
			boolean terminar = false;
			
			while (!terminar) {
				Carta cartaAlAzar = Cartas.azar();
				if (cartas.contains(cartaAlAzar)) {
					// Se la doy
					terminar = true;
				}
			}
			
		}
	}

	private static ArrayList<Carta> inicializarCartas() {
		String[] palos = { "oros", "copas", "espadas", "bastos"};
		ArrayList<Carta> sol = new ArrayList<>();
		for (int i=1;i<=12;i++) {
			if (i != 8 && i!= 9) {
				for ( String palo : palos)  {
					sol.add( new Carta(i,palo) );
				}
			}
		}

		return sol;
	}

	private static List<Jugador> inicializarJugadores() {
		ArrayList<Jugador> sol = new ArrayList<Jugador>();
		for (int i=1; i<=4; i++) {
			sol.add( new Jugador(i));
		}
		return sol;
	}
	

}
