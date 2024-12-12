package t4._desarrolloClases.ej01;

public class Persona {
	String nombre;
	int numeroDeLaSuerte;

	void saludar() {
		System.out.println(
				"Hola, soy " + 
				this.nombre + 
				" y mi número de la suerte es "+ 
				this.numeroDeLaSuerte
				);
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.numeroDeLaSuerte = ((int)(Math.random()*10))+1;
	}
	public Persona() {
		this.nombre = "Anónimo";
		this.numeroDeLaSuerte = (new java.util.Random()).nextInt(10)+1;
	}
}
