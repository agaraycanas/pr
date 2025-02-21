package t02;

public class Ej14 {

	public static void main(String[] args) {

		int i;
		int n = 1;

		while (n <= 10) {
			i = 1;
			while (i <= 10) {
				System.out.println(n + " x " + i + " = " + (n * i));
				i++;
			}
			System.out.println("======================");
			n = n + 1;
		}

	}

}
