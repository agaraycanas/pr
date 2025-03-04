package _pruebas.repasocolecciones;

public class Coche {
	private String marcaModelo;
	public Coche(String mm) {
		this.marcaModelo = mm;
	}
	
	@Override
	public String toString() {
		return this.marcaModelo;
	}
}
