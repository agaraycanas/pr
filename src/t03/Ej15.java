package t03;


public class Ej15 {
	public static String toString(int[][] a) {
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
		//int tam = (int)Math.sqrt(args.length/2);
		int tam = 3;
		int[][] a = new int[tam][tam];
		//int[][] b = new int[tam][tam];

		int contador = 0;
		
		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				a[i][j] = Integer.parseInt(args[contador]);
				contador++;
			}
		}

		/*
		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				b[i][j] = Integer.parseInt(args[contador]);
				contador++;
			}
		}
		*/

		System.out.println("Tamaño: "+ tam+"x"+tam);
		System.out.println(toString(a));
		//System.out.println("=====");
		//System.out.println(toString(b));
	}
}
