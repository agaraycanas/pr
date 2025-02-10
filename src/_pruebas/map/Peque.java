package _pruebas.map;

import java.util.Objects;

public class Peque {
	
	private int numero;
	
	public Peque(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "(P) "+this.numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		Peque p = (Peque)obj;
		return this.numero == p.numero;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.numero );
	}
}
