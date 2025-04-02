package _pruebas.threads;

import java.util.Random;

public class Dos implements Runnable {
	@Override
	public void run() {
		accion();
	}

	private void accion() {
		while (true) {
			int ms = new Random().nextInt(10000)+1;
			System.out.println("\tDOS ("+ms+")");
			try {Thread.sleep(  ms ) ;  } catch (Exception e) {}
		}
	}

}
