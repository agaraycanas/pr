package examen.ex1r;

public class Ej03 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String c = args[2];
		String d = args[3];
		
		for (int i=0;i<b;i++) {
			for (int j=0;j<a;j++) {
				System.out.print(c);
			}
			System.out.println();
			for (int j=0;j<a/2;j++) {
				System.out.print(d);
			}
			System.out.println();
		}
	}
}
