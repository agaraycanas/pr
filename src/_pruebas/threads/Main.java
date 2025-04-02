package _pruebas.threads;

public class Main {

	public static void main(String[] args) {
		Uno uno = new Uno();
		Dos dos = new Dos();
		Thread tUno = new Thread(uno);
		Thread tDos = new Thread(dos);
		tUno.start();
		tDos.start();
	}

}
