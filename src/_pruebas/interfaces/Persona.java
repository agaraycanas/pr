package _pruebas.interfaces;

public class Persona implements Mamifero {
	private String nombre;
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public void saludar() {
		System.out.println("HOLA, soy "+this.nombre);
	}
	public void mamar() {
		System.out.println("CHUP CHUP");
	}
}
