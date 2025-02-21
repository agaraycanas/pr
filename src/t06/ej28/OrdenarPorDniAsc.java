package t06.ej28;

import java.util.Comparator;

public class OrdenarPorDniAsc implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		int sol = 0;
		if ( p1.getDni() > p2.getDni()) {
			sol = 1;
		}
		if ( p1.getDni() < p2.getDni()) {
			sol = -1;
		}
		
		return - sol;
	}

}
