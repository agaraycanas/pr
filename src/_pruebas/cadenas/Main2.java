package _pruebas.cadenas;

public class Main2 {
	interface Accion {
		public String t(String s);
	}
	public static String transformar(String s, Accion a) {
		return a.t(s);
	}
	public static void main(String[] args) {
		String s = "hOla";
		System.out.println(transformar(s, String::toUpperCase ));
	}
}
