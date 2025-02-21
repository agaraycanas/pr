package examen.ex1;

public class Ej03 {
	public static void main(String[] args) {
		int tam = Integer.parseInt(args[0]);
		int[][] a = new int[tam][tam];
		// int c = 1;
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				a[i][j] = Integer.parseInt ( args[  i*tam +  j       + 1 ] );
				//t04.a[i][j] = Integer.parseInt ( args[  c ] ); c++;
			}
		}
			
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if ( a[i][j] %2 != 0 ) {
					System.out.print( a[i][j] + " ");
				}
				else {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}
		

	}
}
