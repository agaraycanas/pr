package t05.b.ej11;

public class Lineas {

	private String simbolo;
	
	public Lineas(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public void linea(int x) {
		for (int i=0;i<x;i++) {
			System.out.print(this.simbolo);
		}
		System.out.println();
	}

	public void linea(int x, int y) {
		for (int i=0;i<x;i++) {
			System.out.print(" ");
		}
		for (int i=0;i<y;i++) {
			System.out.print(this.simbolo);
		}
		System.out.println();
	}

}
