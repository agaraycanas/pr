package t03;

public class Ej20 {
	
	// ============================
	public static String toString(String[][] a , String columna ) {
		String cadena = "";
		
		for (int i = 0; i < a.length; i++) {
			switch ( columna) {
				case "dni": 		cadena += ( a[i][0] + "\n" );break;
				case "nombre": 		cadena += ( a[i][1] + "\n" );break;
				case "apellido": 	cadena += ( a[i][2] + "\n" );break;
				case "todo": 		cadena += ( a[i][0] + " " + a[i][1] + " " + a[i][2] + "\n" );break;
			}
			
		}
		return cadena;
	}

	// ============================
	public static void main(String[] args) {
		String[][] personas = { 
				{ "1", "pepe", "garcia" }, 
				{ "2", "ana", "sanchez" }, 
				{ "3", "perico", "palotes" },
				{ "4", "juan", "palomo" }, 
				{ "6", "maria", "sanchez" }, 
				};

		System.out.println(toString(personas,"DNI"));
	}
	//============================

}
