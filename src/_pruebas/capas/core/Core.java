package _pruebas.capas.core;

import java.util.Random;

import _pruebas.capas.ui.UI;
import _pruebas.capas.uicore.ListenerCore;

public class Core {
	private ListenerCore ui;
	
	public Core(ListenerCore ui) {
		this.ui = ui;
	}
	public int dameDato() {
		return 10;
	}
	public void cosaPeligrosa() {
		try {
			if (new Random().nextInt(2)==0) {
				throw new Exception1();
			}
			else {
				throw new Exception2();
			}
		}
		catch (Exception1 e) {
			this.ui.accionar();
		}
		catch (Exception2 e) {
			this.ui.accionar();
		}

	}
}
