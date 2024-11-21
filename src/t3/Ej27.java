package t3;

public class Ej27 {
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
	
	public static void main(String[] args) {
		mostrar(init());
	}

}
