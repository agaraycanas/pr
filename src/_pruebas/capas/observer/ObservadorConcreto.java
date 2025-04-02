package _pruebas.capas.observer;

public class ObservadorConcreto implements Observer{
	
	private Sujeto sujeto;
	
	public ObservadorConcreto(Sujeto sujeto) {
		this.sujeto = sujeto;
		this.sujeto.addObserver(this);
		((SujetoConcreto)sujeto).simularEvento();
	}
	@Override
	public void actualizar() {
		System.out.println("TACHAN");
	}
}
