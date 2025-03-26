package t05.c.ej04;

public class Main {

	public static boolean esMinuscula(char c) {
		return (c>=97 && c<=122);
	}
	
	
	public static void main(String[] args) {
		char c='`';
		System.out.println(c + " " + (esMinuscula(c) ? "SÍ":"NO"));
		c='a';
		System.out.println(c + " " + (esMinuscula(c) ? "SÍ":"NO"));
		c='z';
		System.out.println(c + " " + (esMinuscula(c) ? "SÍ":"NO"));
		c='{';
		System.out.println(c + " " + (esMinuscula(c) ? "SÍ":"NO"));
		c='G';
		System.out.println(c + " " + (esMinuscula(c) ? "SÍ":"NO"));
	}

}
