package _pruebas.orden;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		int[] a = { 5,6,-1,10};
		System.out.println( Arrays.toString(a) );
		Arrays.sort(a);
		System.out.println( Arrays.toString(a) );
		*/
		
		Cosa[] a = { new Cosa(5), new Cosa(-6), new Cosa(1000), new Cosa(-10)};
		System.out.println( Arrays.toString(a) );
		Arrays.sort(a);
		System.out.println( Arrays.toString(a) );
	}

}
