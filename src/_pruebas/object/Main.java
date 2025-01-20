package _pruebas.object;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe",18,"1");
		Persona p2 = new Persona("Pepe",18,"1");
		Persona p3 = new Persona("Pepe",18,"2");
		Tortuga t1 = new Tortuga();
		Tortuga t2 = new Tortuga();
		Pangolin p = new Pangolin();
		
		System.out.println(p1.equals(p2) ? "SI" : "NO"); //
		System.out.println(p1.equals(p3) ? "SI" : "NO"); //
		System.out.println(p1.equals(t1) ? "SI" : "NO"); //
		System.out.println(p1.equals(t2) ? "SI" : "NO"); //
		System.out.println(p1.equals(p) ? "SI" : "NO");
		
		
	}

}
