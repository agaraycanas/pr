package t03;

import java.util.Scanner;

public class Ej33 {
	
	public static String[][] initDescubierto() {
		String[][] tablero = new String[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablero[i][j] = " ";
			}
		}
		return tablero;
	}

	public static String[][] init() {
		String[][] tablero = new String[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablero[i][j] = ".";
			}
		}
		return tablero;
	}

	public static void mostrar(String[][] t) {
		String[] letra = { "Persona", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		System.out.println("  1  2  3  4  5  6  7  8  9  10");
		System.out.println("  -------------------------------");

		for (int i = 0; i < t.length; i++) {
			System.out.print(letra[i] + "|");
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + "  ");
			}
			System.out.println("|");
		}
		System.out.println("  -------------------------------");
	}

	public static int ubicar(String[][] t, String fila, String columna, String hv, int tam) {
		int f = cf(fila);
		int c = cc(columna);
		if (hv.equals("H") || hv.equals("h")) {
			for (int j = c; j < (c + tam); j++) {
				t[f][j] = "O";
			}
		} else if (hv.equals("V") || hv.equals("v")) {
			for (int i = f; i < (f + tam); i++) {
				t[i][c] = "O";
			}
		} else { // error

		}

		return 0;
	}

	public static int cf(String fila) {
		int f = -1;
		String[] letraMay = { "Persona", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		String[] letraMin = { "t04.a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		for (int i = 0; i < 10; i++) {
			if (fila.equals(letraMin[i]) || fila.equals(letraMin[i])) {
				f = i;
			}
		}
		return f;
	}

	public static int cc(String columna) {
		return (Integer.parseInt(columna) - 1);
	}

	public static void ubicarBarco(int tam, String[][] propio) {
		Scanner scan = new Scanner(System.in);
		String fila, columna, hv;

		System.out.println("Introduce ubicación de barquito de " + tam + ": ");
		fila = scan.next();
		columna = scan.next();
		hv = scan.next();
		ubicar(propio, fila, columna, hv, tam);
		System.out.println("\n=====================\n");
		mostrar(propio);

	}

	public static void pulsarIntro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pulsa INTRO para continuar");
		scan.nextLine();
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
	
	public static void ubicarBarcos(int numJugador, String[][] propio, int[] tam) {
		System.out.println("RONDA JUGADOR "+numJugador);
		mostrar(propio);
		for (int i = 0; i < tam.length; i++) {
			ubicarBarco(tam[i], propio);
		}

		pulsarIntro();
	}
	
	public static int disparo(String[][] tPropio, String[][] tDescubierto, String fila, String columna) {
		int status = 0;
		int f = cf(fila);
		int c = cc(columna);
		
		if (f<0 ||f>9 || c<0 || c>9 ) {
			status = -2;
		}
		else if (tPropio[f][c].equals("O")) {
			tPropio[f][c] = "X";
			tDescubierto[f][c] = "X";
			status = 1;
		}
		else if (tPropio[f][c].equals(".")) {
			tPropio[f][c] = "_";
			tDescubierto[f][c] = "_";
			status = 0;
		}
		else if (tPropio[f][c].equals("X") || tPropio[f][c].equals("_")) {
			status = -1;
		}
		return status;
	}

	public static void disparar(int numJugador, int numDisparo,String[][] propio, String[][] descubierto) {
		System.out.println("Jugador "+numJugador+": Haz tu disparo ["+numDisparo+"/3](fila columna): ");
		Scanner scan = new Scanner(System.in);
		String fila = scan.next();
		String columna = scan.next();
		switch (disparo(propio,descubierto,fila,columna)) {
			case -2: System.out.println("FUERA DE LIMITES");break;
			case -1: System.out.println("DISPARO REPETIDO");break;
			case 0: System.out.println("AGUA");break;
			case 1: System.out.println("TOCADO");break;
			case 2: System.out.println("HUNDIDO");break;
		}
		mostrar(descubierto);
	}
	
	private static boolean situacion(String[][] descubierto, int[] tam) {
		int suma = 0;
		
		for (int i=0;i<tam.length;i++) {
			suma += tam[i];
		}
		
		int tocado=0;
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (descubierto[i][j].equals("X")) {
					tocado++;
				}
			}
		}
		return tocado==suma;
	}

	public static void main(String[] args) {
		int[] tam = { 2, 4 };
		String[][] propio1 = init();
		String[][] propio2 = init();
		String[][] descubierto1 = initDescubierto();
		String[][] descubierto2 = initDescubierto();

		ubicarBarcos(1,propio1,tam);
		ubicarBarcos(2,propio2,tam);
		
		int numJugador = 1;
		int numDisparo = 1;
		boolean terminar = false;
		
		while (!terminar) {
			
			String[][] tPropio = numJugador==1 ? propio2 : propio1;
			String[][] tDescubierto = numJugador==1 ? descubierto1 : descubierto2;
			
			disparar(numJugador,numDisparo,tPropio,tDescubierto);
			
			numDisparo = numDisparo<3 ? numDisparo + 1 : 1 ;
			numJugador = numDisparo == 1 ? (numJugador == 1 ? 2 : 1) : numJugador; 
			terminar=situacion(descubierto1,tam);
		}
		
		System.out.println("PARTIDA FINALIZADA");
	}




}
