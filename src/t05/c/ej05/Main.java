package t05.c.ej05;

public class Main {

	public static char aMayuscula(char c) {
		char sol = c;
		if (c>=97 && c<=122) {
			sol -= 32;
		}
		return sol;
	}
	public static void main(String[] args) {
		System.out.println(aMayuscula('p'));
	}

}
