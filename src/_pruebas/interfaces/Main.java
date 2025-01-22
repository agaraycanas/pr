package _pruebas.interfaces;

public class Main {

	public static void main(String[] args) {
		
		Mamifero[] mamiferos = new Mamifero[50];
		
		for (int i=0; i<mamiferos.length;i++) {
			if ( (int)(Math.random()*2) +1 == 1) {
				mamiferos[i] = new Persona("P-"+i);
			}
			else {
				mamiferos[i] = new Perro();
			}
		}

		for (int i=0; i<mamiferos.length;i++) {
			System.out.print(i+") ");
			mamiferos[i].mamar();
		}
				
		
	}

}
