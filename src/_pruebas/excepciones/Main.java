package _pruebas.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("a: ");
			int a = s.nextInt();
			System.out.println("b: ");
			int b = s.nextInt();

			boolean esDivisible = true;
			boolean todoBien = true;
			
			I a1 = new A();
			B b2 = (B)a1;

			esDivisible = (a % b == 0);
			
			System.out.println(esDivisible ? "SI" : "NO");
		} 
		catch (InputMismatchException e) {
			System.out.println("Introduce sólo números");
		}
		catch (ArithmeticException e) {
			System.out.println("No dividas por cero");
		}
		catch (Exception e) {
			System.out.println("UUUY, algo ha ido mal");
			e.printStackTrace();
		}
		
		System.out.println("FIN");

	}

}
