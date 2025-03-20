package t10.ej23;

import java.util.HashMap;

public class Carta implements Comparable<Carta>{
	
	private int numero;
	private String palo;
	//private Jugador jugador;
	public Carta(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	@Override
	public int compareTo(Carta otra) {
		HashMap<String,Integer> valor = inicializarMap();
		int[] orden = { 0, 1, 2, 12 , 4, 5, 6, 7, 0, 0, 10, 11, 13 }; 
		int sol = 0;
			if (this.numero != otra.numero ) {
				sol = orden[this.numero] - orden[otra.numero];
			}
			else {
				if (!this.palo.equals(otra.palo)) {
					sol = valor.get(this.palo) -  valor.get(otra.palo);
				}
			}
		return sol;
	}
	
	private HashMap<String, Integer> inicializarMap() {
		HashMap<String,Integer> sol = new HashMap<>();
		sol.put("oros", 1);
		sol.put("copas", 2);
		sol.put("espadas", 3);
		sol.put("bastos", 4);
		return sol;
	}
	@Override
	public String toString() {
		String[] nombre = 
			{"-", "as", "dos", "tres", "cuatro", "cinco", "seis",
					"siete", "-", "-", "sota", "caballo", "rey"};
		return nombre[this.numero] + " de " + this.palo;
	}
	
	@Override
	public boolean equals(Object otroObjeto) {
		boolean sol = false;
		if (otroObjeto instanceof Carta) {
			Carta otraCarta = (Carta)otroObjeto;
			sol = 
					this.numero == otraCarta.numero && 
					this.palo.equals(otraCarta.palo);
					;
		}
		return sol;
	}
	
}
