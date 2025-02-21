package t08.ej02;

public class UpperCaseException extends Exception {
	public UpperCaseException(String mensaje) {
		super(mensaje);
	}
	public UpperCaseException() {
		super("Ejercicio02 estandar");
	}
}
