package pruebas;

public class EjIf {
	public static void main(String[] args) {
		char letra='e';
		switch (letra) {
		case 'a','e','i','o','u': System.out.println("Vocal"); break;
		case 'x','y','z': System.out.println("Consonante molona");break;
		default : System.out.println("Consonante cutre");break;
		}
		
	}
}
