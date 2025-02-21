package t08.ej07;

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
		
		
		catch (CeroException e ) {
			System.out.println("nulo");
		}
		catch (ParException e) {
			System.out.println("divisible por dos");
		}
		catch (ImparException e) {
			System.out.println("NO divisible por dos");
		}
		
		/*
		catch (ImparException  | ParException  | CeroException e ) {
			System.out.println(e.getMessage());
		}
		*/
		
	}

	public static void examinar(int x) throws ParException, ImparException, CeroException {
		if (x == 0) { // CERO
			throw new CeroException("CERO");
		}

		if (x % 2 == 0) { // PAR
			throw new ParException("PAR");
		}

		if (x % 2 != 0) { // IMPAR
			throw new ImparException("IMPAR");
		}
	}
}

class CeroException extends Exception {
	public CeroException(String mensaje) {
		super(mensaje);
	}
}

class ParException extends Exception {
	public ParException(String mensaje) {
		super(mensaje);
	}
}

class ImparException extends Exception {
	public ImparException(String mensaje) {
		super(mensaje);
	}
}
