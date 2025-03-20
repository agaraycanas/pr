package t10.ej23;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Carta> cartas = inicializarCartas();
		List<Jugador> jugadores = inicializarJugadores();
		repartir(cartas,jugadores);
		mostrarEstadoJugadores(jugadores);
	}

	private static void mostrarEstadoJugadores(List<Jugador> jugadores) {
		for ( Jugador jugador: jugadores) {
			System.out.println(jugador);
		}
	}

	private static void repartir(ArrayList<Carta> cartas, List<Jugador> jugadores) {
		for (  Jugador jugador : jugadores ) {
			for (int i=0;i<4;i++) {
				boolean terminar = false;
				while (!terminar) {
					Carta cartaAlAzar = Cartas.azar();
					if (cartas.contains(cartaAlAzar)) {
						jugador.getCartas().add(cartaAlAzar); // Se la doy
						cartas.remove(cartaAlAzar); // La quito del mazo
						terminar = true;
					}
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
