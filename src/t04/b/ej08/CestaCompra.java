package t04.b.ej08;

public class CestaCompra {
	private Naranja n;
	private Limon l;
	
	public CestaCompra() {
		this.n = new Naranja(50);
		this.l = new Limon(30);
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
	
	
}
