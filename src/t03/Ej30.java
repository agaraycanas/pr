package t03;

import java.util.Scanner;

public class Ej30 {
	public static String[][] initDescubierto() {
		String[][] tablero = new String[10][10];
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				tablero[i][j] = " ";
			}
		}
		return tablero;
	}

	public static String[][] init() {
		String[][] tablero = new String[10][10];
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				tablero[i][j] = ".";
			}
		}
		return tablero;
	}
	
	public static void mostrar(String[][] t) {
		String[] letra = {"Persona","B","C","D","E","F","G","H","I","J"};
		System.out.println("  1  2  3  4  5  6  7  8  9  10");
		System.out.println("  -------------------------------");
		
		for (int i=0; i < t.length; i++) {
			System.out.print( letra[i]+ "|");
			for (int j=0; j<t[i].length ; j++) {
				System.out.print(t[i][j] + "  ");
			}
			System.out.println("|");
		}
		System.out.println("  -------------------------------");
	}
	
	public static int ubicar
	(
			String[][]	t,
			String		fila,
			String		columna,
			String		hv,
			int			tam
	) 
	{
		int f = cf(fila);
		int c = cc(columna);
		if (hv.equals("H") || hv.equals("h") ) {
			for (int j=c ; j< (c+tam) ; j++ ) {
				t[f][j] = "O";
			}
		}
		else if (hv.equals("V") || hv.equals("v") ) {
			for (int i=f ; i< (f+tam) ; i++ ) {
				t[i][c] = "O";
			}
		}
		else { //error
			
		}
		
		return 0;
	}

	public static int cf(String fila) {
		int f = -1;
		String[] letraMay = {"Persona","B","C","D","E","F","G","H","I","J"};
		String[] letraMin = {"t05.a","b","c","d","e","f","g","h","i","j"};
		for (int i=0;i<10;i++) {
			if (fila .equals(letraMin[i]) || fila.equals(letraMin[i]) ) {
				f=i;
			}
		}
		return f;
	}

	public static int cc(String columna) {
		return ( Integer.parseInt(columna) -1 );
	}

	public static void ubicarBarco(int tam, String[][] propio) {
		Scanner scan = new Scanner(System.in);
		String fila, columna, hv;

		System.out.println("Introduce ubicación de barquito de " + tam+ ": ");
		fila = scan.next();
		columna = scan.next();
		hv = scan.next();
		ubicar(propio, fila,columna,hv,tam);
		System.out.println("\n=====================\n");
		mostrar(propio);
	
	}
	
	public static void main(String[] args) {
		String[][] propio = init();
		mostrar(propio);
		int[] tam = { 2, 2, 3, 3, 4 };
		
		for ( int i=0; i<tam.length ; i++) {
			ubicarBarco( tam[i] ,propio);
		}
	}
}
