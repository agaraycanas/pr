package _pruebas.herencia;

public class Main {
	public static void main(String[] args) {
		Persona ana = new Persona();

		if (ana instanceof Inspector) {
			Inspector x = (Inspector) ana;
			System.out.println("INSPECTOR");
		} else {
			if (ana instanceof Policia) {
				Policia x = (Policia) ana;
				System.out.println("POLICIA");
			}
			else {
				System.out.println("Es una persona corriente");
			}
		}
		System.out.println("FIN");
	}
}
