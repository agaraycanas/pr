package pruebas;

public class KK {

	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 9;
		int i;
		
		System.out.println("INI");

		// OPCION 1
		i = n1;
		while (i <= n2) {
			if ( i%2==1 ) {
				System.out.println(i);
			}
			i = i + 1;
		}
		
		// OPCION 2
		i = (n1%2==0) ? n1+1 : n1;
		while ( i<= n2) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("FIN");
	}
}
