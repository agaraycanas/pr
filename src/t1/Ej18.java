package t1;

import java.util.Scanner;

public class Ej18 {
	public static float areaRectangulo( float lado1 , float lado2 ) {
		return lado1 * lado2  ;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce longitud del lado 1: ");
		float lado1 = scan.nextFloat();
		
		System.out.print("Introduce longitud del lado 2: ");
		float lado2 = scan.nextFloat();
		
		System.out.println(areaRectangulo(lado1, lado2));
		//System.out.println("El área del rectángulo de lados (" + lado1 + "," + lado2 + ") es de " + areaRectangulo(lado1, lado2) + " unidades cuadradas" );
		
	}
}
