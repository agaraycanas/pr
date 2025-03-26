package t03;

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
		/*
		int[][] t05.a = {
				{1,2,3,0},
				{4,5,6,0},
				{7,8,9,0},
				{1,1,1,0}
		};
		int[][] b = {
				{9,8,7,0},
				{6,5,4,0},
				{3,2,1,0},
				{1,1,1,0},
		};
		*/
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
				// cij = ai1.b1j+ai2.b2j+ai3.b3j
				// mult[i][j] = t05.a[i][0]*b[0][j]+t05.a[i][1]*b[1][j]+t05.a[i][2]*b[2][j];
				int acc = 0;
				
				for (int k=0;k<a.length;k++) {
					acc += a[i][k]*b[k][j];
				}
				/*
				acc += t05.a[i][0]*b[0][j];
				acc += t05.a[i][1]*b[1][j];
				acc += t05.a[i][2]*b[2][j];
				*/
				mult[i][j] = acc;
			}
		}
		return mult;
	}
}
