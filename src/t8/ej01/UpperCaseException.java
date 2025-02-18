package t8.ej01;

public class UpperCaseException extends Exception {
	public UpperCaseException(String mensaje) {
		super(mensaje);
	}
	public UpperCaseException() {
		super("Bomba estandar");
	}
}
