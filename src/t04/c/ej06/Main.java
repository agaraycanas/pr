package t04.c.ej06;

public class Main {

	public static char aMinuscula(char c) {
		char sol = c;
		if (c>=65 && c<=90) {
			sol += 32;
		}
		return sol;
	}
	public static void main(String[] args) {
		System.out.println(aMinuscula('P'));
		System.out.println(aMinuscula('p'));
		System.out.println(aMinuscula('{'));
	}

}
