package examen.ex1r;

public class Ej01 {

	public static void main(String[] args) {
		
		int[] a = new int[args.length];

		for (int i=0;i<args.length;i++) {
			a[args.length-i-1] = Integer.parseInt(args[i])*10;
		}
		
		for (int i=0;i<args.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
