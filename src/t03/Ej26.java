package t03;

public class Ej26 {
	
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

	public static void main(String[] args) {
		String[][] t = 
		{
			{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
			{ ".", ".", " ", " ", " ", "X", "X", "X", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", " ", " ", " ", " ", " ", " ", " ", "." },
			{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." }
		};
		mostrar(t);
	}
}
