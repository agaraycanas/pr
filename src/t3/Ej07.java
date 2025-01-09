package t3;

public class Ej07 {
	
	public static int[] obtenerArrayConvertidoAInt( String[] args) {
		int[] arrayFinal = new int[args.length-1];
		for (int i=1; i<args.length; i++) {
			arrayFinal[i-1] = Integer.parseInt(args[i]);
		}
		return arrayFinal;
	}

	public static String[] obtenerArray( String[] args) {
		String[] arrayFinal = new String[args.length-1];
		for (int i=1; i<args.length; i++) {
			arrayFinal[i-1] = args[i];
		}
		return arrayFinal;
	}
	
	public static void main(String[] args) {
		if ( args.length >= 2) {
			//int[] t4.a = obtenerArrayConvertidoAInt(args);
			String[] a = obtenerArray(args);
			
			int n = Integer.parseInt(args[0]);
			//mostrarDeNenN(t4.a,1);
			mostrarDeNenNenString(a,1);
			System.out.println();
			System.out.println("Salto: "+n);
			//mostrarDeNenN(t4.a,n);
			mostrarDeNenNenString(a,n);
		}
		else {
			System.out.println("Al menos introduce dos argumentos de entrada");
		}
	}

	public static void mostrarDeNenN(int[] a, int n) {
		for (int i = 0; i < a.length; i += n) {
			System.out.print(a[i] + " ");
		}
	}

	public static void mostrarDeNenNenString(String[] a, int n) {
		for (int i = 0; i < a.length; i += n) {
			System.out.print(a[i] + " ");
		}
	}
}
