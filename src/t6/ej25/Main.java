package t6.ej25;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> personas = generarPersonas();
	}

	private static ArrayList<Persona> generarPersonas() {
		ArrayList<Persona> personas;
		personas = new ArrayList<>();
		personas.add(new Persona(1,"Pepe","Sánchez",LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(2,"Ana","Sánchez",LocalDate.of(2001, 2, 14)));
		personas.add(new Persona(3,"David","Sánchez",LocalDate.of(2005, 1, 24)));
		personas.add(new Persona(4,"Perico","Smith",LocalDate.of(2004, 10, 10)));
		personas.add(new Persona(5,"Fransuá","Francus",LocalDate.of(2002, 2, 2)));
		return personas;
	}

}
