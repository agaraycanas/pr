package _pruebas.streams;

public class Persona {
	String saludo;
	public Persona(String s) {
		saludo=s;
	}
	public void saludar() {
		System.out.println(saludo);
	}
	@Override
	public String toString() {
		return "Hola, mi saludo es: "+this.saludo;
	}
}
