package t10.ej09;

public class Persona 
	implements Comparable<Persona> 
	{
	private String dni;
	private String nombre;
	private int edad;
	
	public Persona(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad= edad;
	}
	
	public void saludar() {
		System.out.println(
				"Hola, soy " + 
				this.nombre  + 
				", con DNI " +
				this.dni +
				" y "+ 
				(this.edad>=18 ? "" : "NO") +
				" soy mayor de edad"
				);
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	//@Override
	public int compareTo(Persona otraPersona) {
		return - (this.dni.compareTo(otraPersona.dni));
	}
}
