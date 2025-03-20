package t10.ej23;

import java.util.ArrayList;
import java.util.Collection;

public class Jugador {
	private int numero;
	private Collection<Carta> cartas;
	
	public Jugador(int numero) {
		super();
		this.numero = numero;
		this.cartas = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		String[] ca = new String[this.cartas.size()];
		int i=0;
		for ( Carta carta : this.getCartas() ) {
			ca[i] = carta.toString();
			i++;
		}
		return "Jugador " + this.numero + ": "+ String.join(", ", ca);
	}

	public Collection<Carta> getCartas() {
		return cartas;
	}
	
	
	
}
