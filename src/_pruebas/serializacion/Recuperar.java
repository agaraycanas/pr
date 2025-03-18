package _pruebas.serializacion;

import static t10._util.Ficheros.leer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Recuperar {

	private static String fichero = "personas.txt";
	private static String separador = ":";

	private static Persona findByDni(Collection<Persona> personas, int dni) {
		Persona sol = null;
		if (dni != -1) {
			for (Persona persona : personas) {
				if (persona.getDni() == dni) {
					sol = persona;
				}
			}
		}
		return sol;
	}

	public static void main(String[] args) {
		List<String> personasString = leer(fichero);
		ArrayList<Persona> personas = new ArrayList<Persona>();

		System.out.println("RECUPERANDO");

		for (String personaString : personasString) {
			String[] parte = personaString.split(separador);
			int dni = Integer.parseInt(parte[0]);
			String nombre = parte[1];
			Persona p = new Persona(dni, nombre);
			personas.add(p);
		}

		for (String personaString : personasString) {
			String[] parte = personaString.split(separador);
			int dni = Integer.parseInt(parte[0]);
			int dniP = !parte[2].equals("null") ? Integer.parseInt(parte[2]) : -1;
			int dniM = !parte[3].equals("null") ? Integer.parseInt(parte[3]) : -1;
			Persona personaActual = findByDni(personas, dni);
			Persona padre = findByDni(personas, dniP);
			Persona madre = findByDni(personas, dniM);
			personaActual.setPadre(padre);
			personaActual.setMadre(madre);
		}

		System.out.println("RECUPERADO");

		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
