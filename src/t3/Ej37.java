package t3;

public class Ej37 {
	public static void main(String[] args) {
		int tam = Integer.parseInt(args[0]);
		int[] a = new int[tam];
		int[] b = new int[tam];
		
		for (int i=0;i<tam;i++) {
			a[i] = Integer.parseInt( args[i+ 1] );
		}
		for (int i=0;i<tam;i++) {
			b[i] = Integer.parseInt( args[i+ 1+tam] );
		}
		
		// MOSTRAR
		for (int i=0;i<tam;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i=0;i<tam;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for (int i=0;i<tam;i++) {
			System.out.print((a[i]+b[i])+" ");
		}
		
		
	}
}
