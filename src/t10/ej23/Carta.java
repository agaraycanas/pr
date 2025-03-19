package t10.ej23;

public class Carta implements Comparable<Carta>{
	private int numero;
	private String palo;
	private Jugador jugador;
	public Carta(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	@Override
	public int compareTo(Carta o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		String[] nombre = 
			{"-", "as", "dos", "tres", "cuatro", "cinco", "seis",
					"siete", "-", "-", "sota", "caballo", "rey"};
		return nombre[this.numero] + " de " + this.palo;
	}
	
}
