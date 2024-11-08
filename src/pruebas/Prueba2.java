package pruebas;

import java.util.Arrays;

public class Prueba2 {
	public static void f(int[] pepe) {
		pepe[0]=100;
	}
	
	public static void main(String[] args) {
		int[] y = {1,2};
		System.out.println(Arrays.toString(y));
		f(y);
		System.out.println(Arrays.toString(y));
	}
}
