package _pruebas.excepciones.masejemplos;

import java.util.Random;

public class Main {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 4; i++) {
			try {
				metodoPeligroso();
			} catch (Exception e) {
				System.out.println("Algo ha ido mal");
				//System.out.println(e.getMessage());
				System.out.println(e.getMessage().equals("A") ? "CATAPÚM" : "UUY");
			}
			System.out.println("=============");
		}

	}

	private static void metodoPeligroso() throws Exception {
		System.out.println("Comienza el método peligroso");
		int azar = new Random().nextInt(2);
		System.out.println(azar);
		lanzarBomba(azar);
		System.out.println("Termina el método peligroso");
	}

	private static void lanzarBomba(int azar) throws Exception {
		throw new Exception( (azar%2)==0 ? "A" : "B");
	}
}
