package t3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {
	public static int[] suma(int[] a, int[] b) {
		int[] suma = new int[2];
		suma[0] = a[0] + b[0];
		suma[1] = a[1] + b[1];
		return suma;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] v1 = new int[2];
		int[] v2 = new int[2];
		
		System.out.print("Introduce x1: ");
		v1[0] = scan.nextInt();
		
		System.out.print("Introduce y1: ");
		v1[1] = scan.nextInt();
		
		System.out.print("Introduce x2: ");
		v2[0] = scan.nextInt();
		
		System.out.print("Introduce y2: ");
		v2[1] = scan.nextInt();
		
		System.out.println(Arrays.toString(v1));
		System.out.println(
				Arrays.toString(v1)	+ 
				" + " 				+ 
				Arrays.toString(v2) + 
				" = " 				+ 
				Arrays.toString(suma(v1,v2))
				);
		
	}
}
