package pruebas;

public class KK {

	public static void main(String[] args) {
		String mensaje = "HOLA";
		int nVeces = 0;
		int i;
		
		//===========================================
		i = 0;
		
		System.out.println("CON WHILE");
		while ( i < nVeces ) {
			System.out.println( mensaje);
			i ++;
		}
		//===========================================

		i = 0;
		System.out.println("CON DO...WHILE");
		do {
			System.out.println( mensaje);
			i++;
		}
		while ( i < nVeces );
		
		

	}
}
