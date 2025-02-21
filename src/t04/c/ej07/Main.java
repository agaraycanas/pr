package t04.c.ej07;

public class Main {
	public static boolean esMinuscula(char c) {
		return (c>=97 && c<=122);
	}

	public static int numMinusculas(String cadena) {
		int n=0;
		for (int i=0;i<cadena.length();i++) {
			if (esMinuscula(cadena.charAt(i))) {
				n++;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		String palabra = "zmxcnbzmxcbnmznbxc";
		System.out.println(numMinusculas(palabra));
	}

}
