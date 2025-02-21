package t05.ej01;

public final class Circulo implements Figura {
	private final double PI = 3.141592;

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return "(C)"+this.radio;
	}
	
	@Override
	public double area() {
		return PI*this.radio*this.radio;
	}

}
