package _pruebas.depuracion;

public class Main {

	public static void main(String[] args) {
		String p1 = new String("Pepe");
		String p2 = new String("pepe");
		System.out.println( p1.equalsIgnoreCase(p2) ? "SI" : "NO");
	}

}
