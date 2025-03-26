package t10.ej23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	private static String ruta = "src/t10/_files/";
	private static String nombreFichero = "estado.json";

	public static void main(String[] args) throws IOException {
		ArrayList<Carta> 	cartas = null;
		List<Jugador> 		jugadores = null;

		if (existeFichero()) {
			System.out.println("RECUPERANDO");
			jugadores = recuperarEstadoJugadores();
		} else {
			System.out.println("GENERANDO nueva PARTIDA");
			cartas 		= inicializarCartas();
			jugadores 	= inicializarJugadores();
			repartir(cartas, jugadores);
			System.out.println("GUARDANDO");
			guardarEstadoJugadores(jugadores);
		}
		mostrarEstadoJugadores(jugadores);
	}

	private static List<Jugador> recuperarEstadoJugadores() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader (ruta + nombreFichero));
        String json = br.readLine();
		Gson g = new Gson();
		Type tipoLista = new TypeToken<List<Jugador>>(){}.getType();
		List<Jugador> jugadores = g.fromJson(json, tipoLista);
		return jugadores;
	}

	private static boolean existeFichero() {
		File fichero = new File(ruta + nombreFichero);		
		return fichero.exists();
	}

	private static void guardarEstadoJugadores(List<Jugador> jugadores) throws IOException {
		Gson g = new Gson();
		String json = g.toJson(jugadores);
		FileWriter fw = new FileWriter(ruta + nombreFichero);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(json);
		pw.close();
	}

	private static void mostrarEstadoJugadores(List<Jugador> jugadores) {
		for (Jugador jugador : jugadores) {
			System.out.println(jugador);
		}
	}

	private static void repartir(ArrayList<Carta> cartas, List<Jugador> jugadores) {
		for (Jugador jugador : jugadores) {
			for (int i = 0; i < 4; i++) {
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
		String[] palos = { "oros", "copas", "espadas", "bastos" };
		ArrayList<Carta> sol = new ArrayList<>();
		for (int i = 1; i <= 12; i++) {
			if (i != 8 && i != 9) {
				for (String palo : palos) {
					sol.add(new Carta(i, palo));
				}
			}
		}

		return sol;
	}

	private static List<Jugador> inicializarJugadores() {
		ArrayList<Jugador> sol = new ArrayList<Jugador>();
		for (int i = 1; i <= 4; i++) {
			sol.add(new Jugador(i));
		}
		return sol;
	}

}
