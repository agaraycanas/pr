package t2;

public class Ej36 {

	public static void aFor() {
		for (int j = 10; (j < 20 || j % 3 == 0); j *= 2) {
			int k = j / 4;
			System.out.println(k);
		}

	}

	public static void aWhile() {
		int j = 10;
		while (j < 20 || j % 3 == 0) {
			int k = j / 4;
			System.out.println(k);
			j *= 2;
		}
		
	}

	// =======================================================
	public static void main(String[] args) {

		System.out.println("a) Con for");
		System.out.println("=========");
		aFor();

		System.out.println("a) Con while");
		System.out.println("=========");
		aWhile();

	}

}
