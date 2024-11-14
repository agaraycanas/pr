package pruebas;

public class Prueba {
	public static String toString(String[][] a) {
		String cadena = "";
		for (int i=0; i<a.length;i++) {
			for (int j=0; j< a[i].length ; j++) {
				cadena += ( a[i][j] + "\t") ;
			}
			cadena += "\n";
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		String[][] personas = {
			{"1", "pepe", "garcía"},
			{"2", "ana",  "sánchez"},
			{"3", "perico", "palotes"},
			{"4", "juan", "palomo"}
		};
		
		System.out.println(toString(personas));
	}
}
