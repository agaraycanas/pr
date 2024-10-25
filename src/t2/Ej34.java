package t2;

public class Ej34 {

	public static int f(int x) {
		int resultado;
		if (x % 2 == 0) {
			resultado = x + 1;
		} else {
			resultado = x + 3;
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(f(2));
		System.out.println(f(3));
		for (int i = 0; i < 4; i = i + 2) {
			System.out.println(f(i));
		}
		System.out.println(f(2 + 1));
		System.out.println(f(2) + 1);
		System.out.println(f(1) + " " + f(f(1)));
		for (int i = 0; i < 4; i = i + 2) {
			System.out.println(f(f(i)));
		}
	}

}
