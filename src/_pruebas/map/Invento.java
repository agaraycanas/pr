package _pruebas.map;

public class Invento implements Comparable {

	@Override
	public int compareTo(Object o) {
		int sol = 0;
		if (!(o instanceof Invento)) {
			sol = -1;
		}
		return sol;
	}

}
