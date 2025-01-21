package _pruebas.instanciade;

public class Main {

	public static void main(String[] args) {
		SerVivo sv = new SerVivo();
		SerVivo m = new Mamifero();
		SerVivo p = new Persona();
		
		System.out.println( sv instanceof Persona ? "SI" : "NO");
				
	}

}
