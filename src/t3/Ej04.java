package t3;

public class Ej04 {
	public static void main(String[] args) {
		int[] a = { 2,4,6,1,3,5,8,7 };
		mostrarImpares(a);
		/*
		System.out.println();
		mostrarPares(a);
		System.out.println();
		mostrarNumerosImpares(a);
		*/
	}

	public static void mostrarImpares(int[] a) {
		for (int i = 1; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void mostrarPares(int[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}
	}

	public static void mostrarNumerosImpares(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if ( (a[i] % 2) != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
