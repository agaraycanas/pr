package t01;

import java.util.Scanner;

public class Ej19 {
	
	public static float areaCirculo(float radio) {
		final float PI = 3.141592f;
		return  PI * radio * radio ;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el radio: ");
		float radio = scan.nextFloat();
		
		System.out.println("El área del círculo de radio " + radio + " es de " + areaCirculo(radio) + " unidades cuadradas.");
	}
}
