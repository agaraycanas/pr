package t03;

public class Ej08_Calculadora {
	public static String signo(String op) {
		String signo = "";
		switch (op) {
		case "sumar":
			signo = "+";
			break;
		case "restar":
			signo = "-";
			break;
		case "mul":
			signo = "x";
			break;
		case "div":
			signo = "/";
			break;
		}
		return signo;
	}

	public static void main(String[] args) {

		String operacion = args[0];
		String op1s = args[1];
		String op2s = args[2];

		int op1 = Integer.parseInt(op1s);
		int op2 = Integer.parseInt(op2s);

		int solucion = 0;

		switch (operacion) {
		case "sumar":
			solucion = op1 + op2;
			break;
		case "restar":
			solucion = op1 - op2;
			break;
		case "mul":
			solucion = op1 * op2;
			break;
		case "div":
			solucion = op1 / op2;
			break;
		default:
			break;
		}
		System.out.println(op1s + " " + signo(operacion) + " " + op2 + " = " + solucion);
	}
}
