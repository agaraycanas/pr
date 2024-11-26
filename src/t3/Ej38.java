package t3;

public class Ej38 {
	public static void main(String[] args) {
		int primero = Integer.parseInt(args[0]);
		int ultimo = Integer.parseInt(args[1]);
		int inc = Integer.parseInt(args[2]);

		if (primero <= ultimo) {
			for (int i = primero; i <= ultimo; i += inc) {
				System.out.print(i + " ");
			}
		}
		else {
			for (int i = primero; i >= ultimo; i -= inc) {
				System.out.print(i + " ");
			}
		}
	}
}
