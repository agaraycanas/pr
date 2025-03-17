package _pruebas.serializacion;

import static t10._util.Ficheros.leer;

import java.util.ArrayList;
import java.util.List;

public class Recuperar {

	private static String fichero = "personas.txt";
	private static String separador = ":";
	
	public static void main(String[] args) {
		List<String> personasString = leer(fichero);
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		System.out.println("RECUPERANDO");
		
		for ( String personaString : personasString ) {
			String[] parte = personaString.split(separador);
			int dni = Integer.parseInt (parte[0]);
			Persona p = new Persona (dni,parte[1]); 
			personas.add(p);
		}
		
		System.out.println("RECUPERADO");
		for ( Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
