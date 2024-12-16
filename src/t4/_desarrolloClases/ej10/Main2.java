package t4._desarrolloClases.ej10;

public class Main2 {

	public static void main(String[] args) {
		int tam=4;
		CestaCompra[] cestas = new CestaCompra[tam];
		
		for (int i=0;i<cestas.length;i++) {
			int pesoLimon = (int)(Math.random()*10) + 20; //20..30 gr.
			int pesoNaranja = (int)(Math.random()*10) + 20; //20..30 gr.
			cestas[i] = new CestaCompra(pesoNaranja,pesoLimon);
		}
		
		for (int i=0;i<cestas.length;i++) {
			System.out.println("Cesta nº "+(i+1));
			cestas[i].getPesos();
			System.out.println("=================");
		}
		
		cestas[1].getL().setPeso( cestas[1].getL().getPeso() - 5);
		cestas[1].getPesos();
		
	}
}
