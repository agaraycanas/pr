package pruebas;

public class KK {

	public static void main(String[] args) {
		int b = 5;
		System.out.println(b);

		int a = ((b = (b + 3)) + 10);
		System.out.println(b + " " + a);
	}
}
