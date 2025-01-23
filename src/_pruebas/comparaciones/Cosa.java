package _pruebas.comparaciones;

public class Cosa implements Comparable<Cosa>{
	
	private int calidad;

	public Cosa(int calidad) {
		this.calidad = calidad;
	}
	
	@Override
	public String toString() {
		return this.calidad+"";
	}
	
	public int compareTo(Cosa otra) {
		int sol = 0;
		if (this.calidad < otra.calidad) {
			sol = 1;
		}
		else if (this.calidad > otra.calidad) {
			sol = -1;
		}
		return sol;
	};
	
	
}
