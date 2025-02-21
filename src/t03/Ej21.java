package t03;

public class Ej21 {
	
	// ============================
	public static String toString(String[][] a ) {
		String cadena = "";
		cadena += ( a[0][0] + "\t" + a[0][1] + "\t" + a[0][2] + "\n" );
		cadena += "==========================\n";
		for (int i = 1; i < a.length; i++) {
				cadena += ( a[i][0] + "\t" + a[i][1] + "\t" + a[i][2] + "\n" );
		}
			
		return cadena;
	}

	// ============================
	public static void main(String[] args) {
		String[][] personas = { 
				{ "DNI", "NOMBRE", "APELLIDO" }, 
				{ "1", "pepe", "garcia" }, 
				{ "2", "ana", "sanchez" }, 
				{ "3", "perico", "palotes" },
				{ "4", "juan", "palomo" }, 
				{ "6", "maria", "sanchez" }, 
				};

		System.out.println(toString(personas));
	}
	//============================

}
