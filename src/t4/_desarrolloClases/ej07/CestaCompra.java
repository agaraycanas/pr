package t4._desarrolloClases.ej07;

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
