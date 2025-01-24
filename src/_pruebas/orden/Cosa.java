package _pruebas.orden;

public class Cosa implements Comparable<Cosa> {
	private int numero;
	
	public Cosa(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "C "+this.numero;
	}

	@Override
	public int compareTo(Cosa otra) {
		int sol = 0;
		if (this.numero > otra.numero) {
			sol = 1;
		}
		else if (this.numero< otra.numero) {
			sol = -1;
		}
		return sol;
	}
}
