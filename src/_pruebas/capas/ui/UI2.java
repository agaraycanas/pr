package _pruebas.capas.ui;

import _pruebas.capas.core.Core;
import _pruebas.capas.uicore.ListenerCore;

public class UI2 implements ListenerCore {

	private Core core;
	
	public UI2() {
		this.core = new Core(this);
	}

	public void start() {
		this.core.cosaPeligrosa();
		System.out.println("END OF EXECUTION");
	}
	public void myError() {
		System.out.println("OOops, something went wrong");
	}

	@Override
	public void accionar() {
		this.myError();
	}


}
