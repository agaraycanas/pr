package t03;

public class Ej22 {

	// ============================
	public static String toString(String[][] a, String columna) {
		String cadena = "";

		if (columna == "*") {
			for (int j = 0; j < a[0].length; j++) {
				cadena += (a[0][j] + "\t\t");
			}
			
			cadena += "\n=================================================\n";

			for (int i = 1; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					cadena += (a[i][j] + "\t\t");
				}
				cadena += "\n";
			}
		}
		else {
			int posicion=-1;
			
			for (int j=0 ; j<a[0].length;j++) {
				if (a[0][j] == columna) {
					posicion = j;
				}
			}
			
			if (posicion != -1) {
				cadena += columna;
				cadena += "\n=================================================\n";
				for (int i = 1; i < a.length; i++) {
					cadena += (a[i][posicion]);
					cadena += "\n";
				}
			}
			else {
				cadena += "FILTRO DE COLUMNA INVÁLIDO: "+columna;
			}
		}
		return cadena;
	}

	// ============================
	public static void main(String[] args) {
		String[][] personas = { 
				{ "X", 		"Y", 		"Z", 	"W" }, 
				{ "pepe", 	"garcia", 	"1", 	"t04.a" },
				{ "ana", 	"sanchez", 	"2", 	"t04.a" }, 
				{ "perico", "palotes", 	"3", 	"t04.a" }, 
				{ "juan", 	"palomo", 	"4", 	"t04.a" },
				{ "maria", 	"sanchez", 	"6", 	"t04.a" }, 
				};

		System.out.println(toString(personas,"Z"));

	}
	// ============================

}
