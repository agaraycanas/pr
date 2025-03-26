package t09.ej06.v2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce n: ");
		int n = s.nextInt();
		try {
			System.out.print("El número es ");
			examinar(n);
		}
		catch (NumeroException e) {
			HashMap<String,String> traduccion  = new HashMap<>();
			traduccion.put("CERO", "nulo");
			traduccion.put("PAR", "divisible por dos");
			traduccion.put("IMPAR", "NO divisible por dos");
			System.out.println( traduccion.get (e.getMessage()) );
		}
	}

	public static void examinar(int x) throws NumeroException {
		if (x == 0) { // CERO
			throw new NumeroException("CERO");
		}

		if (x % 2 == 0) { // PAR
			throw new NumeroException("PAR");
		}

		if (x % 2 != 0) { // IMPAR
			throw new NumeroException("IMPAR");
		}
	}
}

class NumeroException extends Exception {
	public NumeroException(String mensaje) {
		super(mensaje);
	}
}
