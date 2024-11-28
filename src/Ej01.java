

public class Ej01 {

	public static void main(String[] args) {
		int ancho = Integer.parseInt(args[0]);
		int alto = Integer.parseInt(args[1]);
		String c = args[2];

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(c+" " );
			}
			System.out.println();
		}
	}

}
