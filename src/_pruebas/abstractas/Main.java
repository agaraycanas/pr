package _pruebas.abstractas;

public class Main {
	public static void main(String[] args) {
		SerVivo p = new Persona();
		p.nacer();
		p.morir();
		((Persona)p).cantar();
	}
}
