package _pruebas.orden;

public class Cosa implements Comparable<Cosa> {

	private int numero;

	public Cosa(int numero) {
		this.numero = numero;
	}
	

	@Override
	public boolean equals(Object otro) {
		boolean sol = false;
		if ( otro instanceof Cosa && this.numero == ((Cosa)otro).numero) {
			sol = true;
		}
		return sol;
	}

	public int compareTo(Cosa otro) {
		int sol = 0;
		
			if ( this.numero > otro.numero ) {
				sol = 1;
			}
			else if ( this.numero < otro.numero ) {
				sol = -1;
			}
		return sol;
	}

}
