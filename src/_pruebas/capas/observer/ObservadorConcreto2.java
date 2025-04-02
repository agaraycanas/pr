package _pruebas.capas.observer;

public class ObservadorConcreto2 implements Observer{
	
	private Sujeto sujeto;
	
	public ObservadorConcreto2(Sujeto sujeto) {
		this.sujeto = sujeto;
		this.sujeto.addObserver(this);
		((SujetoConcreto)sujeto).simularEvento();
	}
	@Override
	public void actualizar() {
		System.out.println("SOY EL OBSERVADOR 2. Ha ocurrido algo por abajo");
	}
}
