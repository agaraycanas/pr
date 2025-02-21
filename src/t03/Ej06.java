package t03;

public class Ej06 {
	public static void main(String[] args) {
		int[] a = { 2,4,6,1,3,5,8,7 };
		int n = 5;

		mostrarDeNenN(a,n);
	}

	public static void mostrarDeNenN(int[] a, int n) {
		for (int i = 0; i < a.length; i += n) {
			System.out.print(a[i] + " ");
		}
	}
	
}
