package t6.ej27;

import java.util.Comparator;

public class CompararPorDNIAscendente implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return ((Integer)(p1.getDni())).compareTo((Integer)(p2.getDni()));
	}

	/*
	@Override
	public int compare(Persona p1, Persona p2) {
		int sol = 0;
		if ( p1.getDni() > p2.getDni()) {
			sol = 1;
		}
		if ( p1.getDni() < p2.getDni()) {
			sol = -1;
		}
		
		return sol;
	}
	*/
}
