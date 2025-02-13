package t6.ej27;

import java.util.Comparator;

public class CompararPorApeAscNomAsc implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		int sol = p1.getApellido().compareTo(p2.getApellido());
		/*
		if (sol == 0) {
			sol = p1.getNombre().compareTo(p2.getNombre());
		}
		return sol;
		*/
		return sol == 0 ?  p1.getNombre().compareTo(p2.getNombre()) : sol;

	}
}
