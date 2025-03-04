package t10.ej08;

public class Persona //implements Comparable<Persona> 
	{
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

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	/*
	@Override
	public int compareTo(Persona otraPersona) {
		return - (this.dni.compareTo(otraPersona.dni));
	}
	*/
	
}
