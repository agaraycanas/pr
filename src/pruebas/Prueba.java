package pruebas;

class Prueba {

	public static void f(int[] a) {
		a[0] = 100;
	}

	public static void main(String[] args) {
		int[] miArray = { 10, 20, 30, 40, 50 };
		System.out.println(miArray[0]);
		f(miArray);
		System.out.println(miArray[0]);
	}

}