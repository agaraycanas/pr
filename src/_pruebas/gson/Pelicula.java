package _pruebas.gson;

public class Pelicula {
	private String titulo;

	public Pelicula(String titulo) {
		super();
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "P: "+this.titulo;
	}

}
