package _pruebas.capas;

import _pruebas.capas.ui.UI;

public class Main {
	private UI ui;

	public Main() {
		this.ui = new UI();
		this.ui.start();
	}
	public static void main(String[] args) {
		new Main();
	}

}
