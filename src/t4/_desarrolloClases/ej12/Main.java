package t4._desarrolloClases.ej12;

public class Main {

	public static void main(String[] args) {
		Letras l = new Letras("C");
		l.p("rlos");
		
		Letras.q();
		// Opcionalmente se podría poner
		// l.q();
		// aunque es mejor invocar métodos estáticos por el nombre 
		// de la clase y no a través de una referencia de un objeto
		
		l.setCadena("in");
		l.p("udito");
	}

}
