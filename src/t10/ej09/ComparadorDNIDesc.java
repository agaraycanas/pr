package t10.ej09;

import java.util.Comparator;

public class ComparadorDNIDesc implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		return - p1.getDni().compareTo(p2.getDni());
	}
	
}
