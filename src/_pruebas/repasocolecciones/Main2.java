package _pruebas.repasocolecciones;

import java.util.Collection;
import java.util.HashSet;

public class Main2 {

	public static void main(String[] args) {
		Collection<Persona> personas = new HashSet<Persona>();
		personas.add(new Persona("Pepe","Sánchez"));
		personas.add(new Persona("Pepe","García"));
		personas.add(new Persona("Pepe","Sánchez"));
		personas.add(new Persona("Ana","García"));
		System.out.println(personas);
	}

}
