package t6.ej27;

import java.util.Comparator;

public class CompararPorEdadAscDniAsc implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		int sol = - (p1.getfNac().compareTo(p2.getfNac()));
		/*
		if ( sol == 0) {
			sol = ((Integer)p1.getDni()).compareTo(  (Integer)p2.getDni()  );
		}
		return sol;
		*/
		return sol == 0 ? ((Integer)p1.getDni()).compareTo(  (Integer)p2.getDni()  ) : sol;
	}

}
