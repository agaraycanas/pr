package pruebas;

class Prueba {

	public static int f(int n) {
		n = n + 1;
		System.out.println(n);
		return n;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("==============");
		System.out.println(f(n));
		System.out.println("**************");
		System.out.println(n);
	}
}