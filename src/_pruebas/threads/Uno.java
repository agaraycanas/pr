package _pruebas.threads;

import java.util.Random;

public class Uno implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("UNO comienza...");
			esperar();
			System.out.println("UNO termina");
		}
	}

	private void esperar() {
		try {Thread.sleep(new Random().nextInt(5000));} catch (InterruptedException e) {}
	}

}
