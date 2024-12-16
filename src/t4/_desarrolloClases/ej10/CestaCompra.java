package t4._desarrolloClases.ej10;

public class CestaCompra {
	private Naranja n;
	private Limon l;
	
	public CestaCompra() {
		this.n = new Naranja(50);
		this.l = new Limon(30);
	}
	
	public CestaCompra(int pesoNaranja, int pesoLimon) {
		this.n = new Naranja(pesoNaranja);
		this.l = new Limon(pesoLimon);	
	}
	
	public void comerFruta() {
		this.n.comer();
		this.l.comer();
	}

	public Naranja getN() {
		return this.n;
	}

	public Limon getL() {
		return this.l;
	}
	
	public void getPesos() {
		System.out.println("Peso naranja: "+ this.n.getPeso());
		System.out.println("Peso limón: "+ this.l.getPeso());
	}
	
}
