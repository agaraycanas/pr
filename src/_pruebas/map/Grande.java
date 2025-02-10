package _pruebas.map;

public class Grande {
	private String nombre;
	
	
	public Grande(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "(G) "+this.nombre;
	}
}
