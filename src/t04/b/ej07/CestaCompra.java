package t04.b.ej07;

public class CestaCompra {
	 Naranja n;
	 Limon l;
	
	public CestaCompra() {
		this.n = new Naranja(50);
		this.l = new Limon(30);
	}
	
	public void comerFruta() {
		this.n.comer();
		this.l.comer();
	}
}
