package t03;


public class Ej17 {
	
	//==============================================================

	public static int[][] suma(int[][] a, int[][] b) {
		int[][] suma = new int[a.length][a.length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				suma[i][j] = a[i][j] + b[i][j];
			}
		}
		return suma;
	}

	//==============================================================
	
	public static int[][] mult(int[][] a, int[][] b) {
		int[][] mult = new int[a.length][a.length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				int acc = 0;
				for (int k=0;k<a.length;k++) {
					acc += a[i][k]*b[k][j];
				}
				mult[i][j] = acc;
			}
		}
		return mult;
	}
	
	//==============================================================

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
	
	//==============================================================
	public static void main(String[] args) {
		int tam = (int)Math.sqrt(args.length/2);
		//int tam = 3;
		int[][] a = new int[tam][tam];
		int[][] b = new int[tam][tam];

		int contador = 0;
		
		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				a[i][j] = Integer.parseInt(args[contador]);
				contador++;
			}
		}

		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				b[i][j] = Integer.parseInt(args[contador]);
				contador++;
			}
		}

		System.out.println("Tamaño: "+ tam+"x"+tam);
		System.out.println(toString(a));
		System.out.println("=====");
		System.out.println(toString(b));
		System.out.println("====SUMA=====");
		System.out.println(toString(suma(a,b)));
		System.out.println("====MULT=====");
		System.out.println(toString(mult(a,b)));
		
		
	}
}
