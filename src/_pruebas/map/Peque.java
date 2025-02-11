package _pruebas.map;

import java.util.Objects;

public class Peque implements Comparable {

	private int numero;

	public Peque(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "(P) " + this.numero;
	}

	@Override
	public boolean equals(Object obj) {
		Peque p = (Peque) obj;
		return this.numero == p.numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.numero);
	}

	public int compareTo(Object o) {
		int sol = 0;
		if (!(o instanceof Peque)) {
			sol = 1;
		} else {
			Peque otro = (Peque) o;
			if (this.numero < otro.numero) {
				sol = -1;
			}
			if (this.numero > otro.numero) {
				sol = 1;
			}
		}
		return sol;
	}

}
