package _pruebas.encapsulacion.constructores;

public class Privadisimo {
	
	private Privadisimo() {
		System.out.println("Se ha creado un nuevo objeto privadísimo");
	}
	
	public static Privadisimo m() {
		return new Privadisimo();
	}
	public void publico() {
		System.out.println("PUBLICO");
	}
}
