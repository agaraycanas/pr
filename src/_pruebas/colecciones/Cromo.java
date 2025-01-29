package _pruebas.colecciones;

public class Cromo {
	private int num;
	public Cromo(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "(C)"+this.num+" ";
	}

	@Override
	public boolean equals(Object otro) {
		return  this.num ==  ((Cromo)otro).num;
	}
}
