package _pruebas.capas.observer;

import java.util.ArrayList;
import java.util.Collection;

public class SujetoConcreto implements Sujeto{
	
	private Collection<Observer> observers;
	
	public SujetoConcreto() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void simularEvento() {
		for (Observer o  : observers) {
			o.actualizar();
		}
	}
}
