package _pruebas.variadas;

public class Main {
	public static int sumar2(int x, int y) {
		return x+y;
	}
	public static int sumar3(int x, int y, int z) {
		return x+y+z;
	}
	public static int sumar(int... sumandos ) {
		int acc = 0;
		for (int i=0; i<sumandos.length; i++) {
			acc += sumandos[i];
		}
		return acc;
	}
	
	public static void main(String[] args) {
		System.out.println(sumar(1,10,20,30,40));
	}
}
