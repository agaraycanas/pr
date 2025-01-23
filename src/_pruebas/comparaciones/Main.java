package _pruebas.comparaciones;

public class Main {

	public static boolean menorQue(Cosa c1, Cosa c2) {
		return c1.compareTo(c2) < 0;
	}
	public static void main(String[] args) {
		Cosa c1 = new Cosa(1000);
		Cosa c2 = new Cosa(987);
		
		System.out.println(
						"¿c1(" + 
						c1 +
						") < c2(" + 
						c2 + 
						")?" + 
						(menorQue(c1, c2)?"SI":"NO")
						);	
	}

}
