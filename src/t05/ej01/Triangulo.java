package t05.ej01;

public final class Triangulo implements Figura {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "(T)"+this.base+","+this.altura;
	}

	@Override
	public double area() {
		return (this.base*this.altura) / 2;
	}

}
