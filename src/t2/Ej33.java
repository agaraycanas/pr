package t2;

public class Ej33 {

	public static void main(String[] args) {
		int n = 100;
		float acc = 0;
		
		for (int i=1; i<=n;i++) {
			acc = acc + ((i*i) + 1.0f) / (i);
		}
		
		System.out.println("La suma de la serie es " + acc);

	}

}
