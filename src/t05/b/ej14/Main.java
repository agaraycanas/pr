package t05.b.ej14;

import java.util.Random;

import t05.b.ej04.Limon;

public class Main {

	public static void main(String[] args) {
		
		new Limon(0);

		Random r = new Random();
		Persona misterio = null;
		Persona[] personas = new Persona[10];
		
		for (int i = 0; i < 10; i++) {
			switch (r.nextInt(3)) {
				case 0: misterio = new Persona("Juan");break;
				case 1: misterio = new Trabajador("Juan");break;
				case 2: misterio = new Informatico("Juan");break;
			}
			personas[i] = misterio;
		}
		
		for (int i = 0; i < 10; i++) {
			personas[i].saludar();
		}

	}
}
