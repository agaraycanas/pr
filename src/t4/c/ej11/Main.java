package t4.c.ej11;

public class Main {

	public static String reves (String s) {
		String sol = "";
		for (int i=0;i<s.length();i++) {
			sol = s.charAt(i) + sol;
		}
		return sol;
	}
	public static void main(String[] args) {
		String frase = "Eva usaba rimel y le miraba suave";
		System.out.println(reves(frase));
	}

}
