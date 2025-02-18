package _pruebas.excepciones.ej;

public class Ejercicio02 {
    public static void main(String[] args) {
    	throw new A("PUM");
    }
 }
class A extends RuntimeException {
	public A(String m) {
		super(m);
	}
}

