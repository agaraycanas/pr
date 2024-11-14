package t3;

public class Ej22 {
	
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
				{  "NOMBRE", "APELLIDO" ,"DNI"}, 
				{  "pepe", "garcia" ,"1"}, 
				{  "ana", "sanchez" ,"2"}, 
				{ "perico", "palotes" ,"3"},
				{ "juan", "palomo","4" }, 
				{ "maria", "sanchez","6" }, 
				};

		System.out.println(toString(personas));
	}
	//============================

}
