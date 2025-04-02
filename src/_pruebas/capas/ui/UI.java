package _pruebas.capas.ui;

import _pruebas.capas.core.Core;
import _pruebas.capas.uicore.ListenerCore;

public class UI implements ListenerCore {

	private Core core;
	
	public UI() {
		this.core = new Core(this);
	}

	public void start() {
		this.core.cosaPeligrosa();
		System.out.println("FIN DE EJECUCION");
	}
	public void showError() {
		System.out.println("UUUY, algo ha ido mal");
	}

	@Override
	public void accionar() {
		this.showError();
	}


}
