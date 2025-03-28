package _pruebas.threads;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Uno());
		t1.start();

		Thread t2 = new Thread(new Dos());
		t2.start();
	}
}
