package t02;

public class Ej35 {

	public static void aWhile() {
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i = i - 2;
		}
	}

	public static void aFor() {
		for ( int i = 10 ; i>0 ; i = i-2 ) {
			System.out.println(i);
		}
	}

	// =======================================================
	private static void bWhile() {
		int i = 10;
		int j = 20;
		while (j > i) {
			int k = i + 1;
			i = i * 2;
			System.out.println(i + "," + j + "," + k);
			j = j - 1;
		}
	}

	public static void bFor() {
		for ( int i=10,j=20 ; j > i  ; j= j-1) {
			int k = i + 1;
			i = i * 2;
			System.out.println(i + "," + j + "," + k);
		}
	}

	// =======================================================
	public static void cWhile() {
		boolean amor = true;
		int i = 1;
		while (amor || i <= 4) {
			if (amor) {
				System.out.println("Me quiere");
			} else {
				System.out.println("NO Me quiere");
			}
			amor = !amor;
			i++;
		}

	}

	public static void cFor() {
		boolean amor;
		int i;
		
		for (amor = true, i = 1 ; amor || i <= 4 ; amor = !amor, i++) {
			if (amor) {
				System.out.println("Me quiere");
			} else {
				System.out.println("NO Me quiere");
			}
		}
	}

	// =======================================================
	public static void main(String[] args) {
		System.out.println("t04.a) Con while");
		System.out.println("=========");
		aWhile();

		System.out.println("t04.a) Con for");
		System.out.println("=========");
		aFor();

		System.out.println("b) Con while");
		System.out.println("=========");
		bWhile();

		System.out.println("b) Con for");
		System.out.println("=========");
		bFor();

		System.out.println("c) Con while");
		System.out.println("=========");
		cWhile();

		System.out.println("c) Con for");
		System.out.println("=========");
		cFor();
	}

}
