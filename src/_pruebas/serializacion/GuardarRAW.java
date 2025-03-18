package _pruebas.serializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GuardarRAW {

	private static String fichero = "personas.raw";
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Persona padre = new Persona( 1, "Adan", null, null);
		Persona madre = new Persona( 2, "Eva", null, null);
		
		Persona pepe = new Persona(10,"Pepe",padre , madre);
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(padre);
		personas.add(madre);
		personas.add(pepe);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
		for ( Persona persona : personas) {
			oos.writeObject (persona); 
		}
		oos.close();
		System.out.println("FIN PROCESO");
	}

}
