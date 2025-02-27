package t10.ej08;

public class Persona {
	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public void saludar() {
		System.out.println(
				"Hola, soy " + 
				this.nombre  + 
				", con DNI " +
				this.dni
				);
	}
	
}
