package pruebas;

public class Prueba {

	public static void main(String[] args) {
		comparar("A","A");
		comparar("A","B");
		comparar("B","B");
	}

	public static void comparar(String a1, String a2) {
		if (a1 == a2) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}

}
