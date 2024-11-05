package pruebas;

import java.util.Arrays;

class Prueba {

	public static void f(int[] x) {
		System.out.println("Inicio de f()");
		System.out.println(Arrays.toString(x));
		x[1] = x[1] + 1;
		x[1] += 1;
		x[1]++;
		++x[1];
		System.out.println(Arrays.toString(x));
		System.out.println("Fin de f()");
	}

	public static void main(String[] args) {
		int[] n = { 10, 20} ;

		System.out.println(Arrays.toString(n));
		f(n);
		System.out.println(Arrays.toString(n));
	}
}