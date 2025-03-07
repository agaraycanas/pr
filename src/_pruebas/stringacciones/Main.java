package _pruebas.stringacciones;

public class Main {

	public static void main(String[] args) {
		String cadena = "ABC--DE-FGHI";
		String[] trozos = cadena.split("--");
		System.out.println(trozos[1]);
		
		int cont = 1;
		for ( String trozo :  trozos) {
			System.out.print(cont + ": ");
			System.out.println(trozo);
			cont++;
		}
	}

}
