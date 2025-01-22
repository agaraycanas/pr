package _pruebas.interfaces;

public class Perro implements Mamifero {
	public void ladrar() {
		System.out.println("GUAU GUAU");
	}

	@Override
	public void mamar() {
		System.out.println("GROF GROF");
	}
}
