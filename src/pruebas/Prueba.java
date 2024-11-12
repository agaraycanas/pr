package pruebas;


public class Prueba {
	public static void main(String[] args) {
		//TODO EN UNO
		/*
		int[][] a = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		*/
		
		// DECLARACION
		int[][] a;
		
		// INICIALIZAMOS
		a = new int[3][4];
		
		//ASIGNACIÓN
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;

		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		a[1][3] = 8;

		a[2][0] = 9;
		a[2][1] = 10;
		a[2][2] = 11;
		a[2][3] = 12;
		
		// MOSTRAR
		System.out.println(arrayBidimensionalACadena(a));
	}

	public static String arrayBidimensionalACadena(int[][] a) {
		String cadena = "";
		for (int i=0; i<a.length;i++) {
			for (int j=0; j< a[i].length ; j++) {
				cadena += ( a[i][j] + "\t") ;
			}
			cadena += "\n";
		}
		return cadena;
	}

}