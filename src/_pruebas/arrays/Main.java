package _pruebas.arrays;

import java.util.Arrays;

public class Main {

	private static int max(int[]a) {
		int sol = Integer.MIN_VALUE;
		for ( int e : a) {
			sol = e>sol ? e : sol; 
		}
		return sol;
	}

	private static int min(int[]a) {
		int sol = Integer.MAX_VALUE;
		for ( int e : a) {
			sol = e<sol ? e : sol; 
		}
		return sol;
	}

	
	public static void main(String[] args) {
		int[] a = { 4, 1000, -10 , -1234 , 7 , 100, 40 };
		System.out.println("Dado el array ...");
		System.out.println(Arrays.toString(a));
		System.out.println("Máximo: " + max(a));
		System.out.println("Mínimo: " + min(a));
		
	}

}
