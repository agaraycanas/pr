package t02;

import java.util.Scanner;

public class Ej29 {

	public static long fib(int x) {
		long sol=0;
		
		if (x==1) {
			sol = 0;
		}
		if (x==2) {
			sol = 1;
		}
		if (x>=3) {
			long a1 = 0;
			long a2 = 1;
			for (int i=3;i<=x;i++) {
				sol = a1 + a2;
				a1 = a2;
				a2 = sol;
			}
		}
		
		return sol;
	}
	
	/*
	fib(i)	0  	1	1	2	3	5	8	13	21	34	55
	i		1	2	3	4	5	6	7	8	9	10	11
	*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n (0<n<94): ");
		int n= scan.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.print(fib(i)+" ");
		}
	}
}
