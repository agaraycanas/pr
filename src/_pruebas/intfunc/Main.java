package _pruebas.intfunc;

public class Main {
	public static int operar (int a , int b, Operacion op) {
		return op.operar(a);
	}

	public static void main(String[] args) {
		int n1 = 13;
		int n2 = 4;
		
		System.out.println( operar(n1, n2, x -> 10  ) );
	}

}
