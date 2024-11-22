package t3;

public class Ej29 {
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
		String[] letra = {"A","B","C","D","E","F","G","H","I","J"};
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
			/*
			int			fila,
			int 		columna,
			*/
			String		hv,
			int			tam
	) 
	{
		int f = cf(fila);
		int c = cc(columna);
		t[f][c] = "O";
		return 0;
	}

	public static int cf(String fila) {
		int f = -1;
		String[] letraMay = {"A","B","C","D","E","F","G","H","I","J"};
		String[] letraMin = {"a","b","c","d","e","f","g","h","i","j"};
		for (int i=0;i<10;i++) {
			if (fila == letraMay[i] || fila == letraMin[i] ) {
				f=i;
			}
		}
		return f;
	}

	public static int cc(String columna) {
		return ( Integer.parseInt(columna) -1 );
	}

	public static void main(String[] args) {
		String[][] propio = init();
		mostrar(propio);
		ubicar(propio, "c","1","H",4);
		System.out.println("\n=====================\n");
		mostrar(propio);
	}
}
