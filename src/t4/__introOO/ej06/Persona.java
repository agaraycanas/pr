package t4.__introOO.ej06;

public class Persona {
	
	//Persona this;
	String nombre;
	int edad;
	
	void saludar() {
		System.out.println("HOLA, soy " + this.nombre + " y mi edad es "+this.edad);
	}
	
	void despedirse() {
		System.out.println("ADIÓS");
	}
}