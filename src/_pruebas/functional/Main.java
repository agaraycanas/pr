package _pruebas.functional;

public class Main {
	interface OperacionMonaria {public boolean op(boolean a); }
	
	public static int operarBi(int a, int b, Operacion op) {
		return op.operar(a, b);
	}
	
	public static void main(String[] args) {
		
		System.out.println(
				operarBi( 2, 3, 
						/* new Operacion() {public int operar(int a, int b) {return a+b;}} ) */
						(a,b)->a+b
						)
						);
	}
}
