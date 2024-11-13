package t3;

public class Ej14 {

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
		int[][] a = {
				{1,0,1},
				{1,-1,2},
				{-7,4,3},
		};
		int[][] b = {
				{-1,1,0},
				{-1,0,1},
				{7,-3,3},
		};
		int[][] c = mult(a,b);
		
		System.out.println(toString(a));
		System.out.println();
		System.out.println("  X  ");
		System.out.println();
		System.out.println(toString(b));
		System.out.println();
		System.out.println("  =  ");
		System.out.println(toString(c));
	}

	public static int[][] mult(int[][] a, int[][] b) {
		int[][] mult = new int[a.length][a.length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				mult[i][j] = a[i][j] + b[i][j];
			}
		}
		return mult;
	}
}
