package examen.ex1;
public class Ej02 {
	public static void main(String[] args) {
		int tam = Integer.parseInt( args[0] );
		int[] a = new int[tam];
		
		/*
		for (int i=0;i<tam;i++) {
			t4.a[i] = Integer.parseInt (args [i+1]);
		}
		*/
		
		for (int i=1;i<=tam;i++) {
			a[i-1] = Integer.parseInt (args [i]);
		}

		for (int i=0;i<tam;i++) {
			if (a[i]>30) {
				System.out.print("X ");
			}
			else {
				System.out.print( a[i] + " ");
			}
		}
	}
}
