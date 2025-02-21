package t04.b.ej02;

public class Main {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100) +1 ;
		for (int i = 0; i < n; i++) {
			new A();
		}
		if (A.numeroDeObjetos() == n) {
			System.out.println("Todo OK. Se han creado "+n+" objetos");
		}
		else {
			System.out.println("ERROR: Deberían haberse creado "+n+" objetos, pero se han creado "+A.numeroDeObjetos());
		}
	}

}
