package t03;

public class Ej36 {
	public static void main(String[] args) {
		String palabra = args[0];
		int veces = Integer.parseInt( args[1] );
		
		while (veces > 0) {
			for (int i=0;i<veces;i++) {
				System.out.print(palabra+" ");
			}
			System.out.println();
			veces /= 2;
		}
	}
}
