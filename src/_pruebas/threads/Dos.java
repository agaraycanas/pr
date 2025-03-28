package _pruebas.threads;

import java.util.Random;

public class Dos implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("DOS comienza...");
			esperar();
			System.out.println("DOS termina");
		}
	}

	private void esperar() {
		try {Thread.sleep(new Random().nextInt(5000));} catch (InterruptedException e) {}
	}

}
