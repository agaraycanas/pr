package t04.c.ej03;

public class Main {

	public static boolean esMayuscula(char c) {
		return (c>=65 && c<=90);
	}
	
	
	public static void main(String[] args) {
		System.out.println(esMayuscula('@') ? "@ SÍ":"@ NO");
		System.out.println(esMayuscula('A') ? "A SÍ":"A NO");
		System.out.println(esMayuscula('Z') ? "Z SÍ":"Z NO");
		System.out.println(esMayuscula('[') ? "[ SÍ":"[ NO");
		System.out.println(esMayuscula('g') ? "g SÍ":"g NO");
	}

}
