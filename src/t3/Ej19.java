package t3;

public class Ej19 {
	
	// ============================
	public static String toString(String[][] a) {
		String cadena = "";
		for (int i = 0; i < a.length; i++) {
			cadena += ( a[i][1]); // Nombre
			cadena += "\n";
		}
		return cadena;
	}

	// ============================
	public static void main(String[] args) {
		String[][] personas = { 
				{ "1", "pepe", "garcía" }, 
				{ "2", "ana", "sánchez" }, 
				{ "3", "perico", "palotes" },
				{ "4", "juan", "palomo" } 
				};

		System.out.println(toString(personas));
	}
	//============================

}
	//============================
