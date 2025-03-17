package _pruebas.serializacion;

import static t10._util.Ficheros.escribir;
import static t10._util.Ficheros.nuevoArchivo;

import java.util.ArrayList;

public class Guardar {

	private static String fichero = "personas.txt";
	private static String separador = ":";
	
	public static void main(String[] args) {
		Persona padre = new Persona( 1, "Adan", null, null);
		Persona madre = new Persona( 2, "Eva", null, null);
		
		Persona pepe = new Persona(10,"Pepe",padre , madre);
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(padre);
		personas.add(madre);
		personas.add(pepe);
		
		System.out.println("GUARDANDO");
		nuevoArchivo(fichero);
		
		for (Persona p : personas) {
			String lineaAEscribir = 
					p.getDni()		+ separador + 
					p.getNombre()	+ separador +
					(p.getPadre() != null ? p.getPadre().getDni() : "null") + separador +
					(p.getMadre() != null ? p.getMadre().getDni() : "null") 
					;
			escribir(fichero,lineaAEscribir);
		}
		System.out.println("GUARDADO");
	}

}
