package t1;

public class Ej05 {
	/*
	 * Indicar el tipo y valor de las siguientes expresiones y 
	 * subexpresiones, así como las conversiones automáticas de 
	 * tipo realizadas, asumiendo que existen las siguientes variables: 
	 * int i=1; long g=1; float f=1.0f; double d=1.0;boolean b=true;
	 * 
	 * Ejercicio 1
	 * ============
	 * 
	 * 1+2L+3f+4.0
	 * 
	 * 1+2L		(int)1   +    (long)2   ===========>   (long) 3
	 * 
	 * (long) 3     +     (float) 3f   ============>	(float) 6
	 * 
	 * 
	 * (float) 6    +      (double) 4.0  =========>		(double) 10
	 *
	 */
	public static void main(String[] args) {
		int i=1; long g=1; float f=1.0f; double d=1.0;boolean b=true;
		System.out.println(((1+2)*i)>(f+2.0));
	}
}
