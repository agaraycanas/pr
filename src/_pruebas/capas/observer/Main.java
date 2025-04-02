package _pruebas.capas.observer;

public class Main {

	public static void main(String[] args) {
		Sujeto sujeto = new SujetoConcreto();
		Observer observer1 = new ObservadorConcreto(sujeto);
		Observer observer2 = new ObservadorConcreto2(sujeto);
	}

}
