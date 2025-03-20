package _pruebas.gson;

public class Libro {
	private String titulo;

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "L: "+this.titulo;
	}
	
	
}
