package t05.b.ej05;

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
