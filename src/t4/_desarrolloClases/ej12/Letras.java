package t4._desarrolloClases.ej12;

public class Letras {
	
	protected String cadena;

	public Letras(String cadena) {
		this.cadena = cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public void p(String cadena) {
		System.out.print(this.cadena + "a" + cadena);
	}

	public static void q() {
		System.out.print(" es ");
	}
}
