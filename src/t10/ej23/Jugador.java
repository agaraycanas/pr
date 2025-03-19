package t10.ej23;

import java.util.Collection;

public class Jugador {
	private int numero;
	private Collection<Carta> cartas;
	
	public Jugador(int numero) {
		super();
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Jugador " + this.numero + ": ";
	}
	
}
