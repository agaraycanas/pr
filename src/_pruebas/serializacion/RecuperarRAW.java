package _pruebas.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RecuperarRAW {

	private static String fichero = "personas.raw";

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
		Object o = null;
		o = ois.readObject();
		ArrayList<Persona> personas = new ArrayList<>();
		
		while (o!=null) {
			Persona persona = (Persona)o;
			personas.add(persona);
			try {
				o = ois.readObject();
			}
			catch (Exception e) {	
				o = null;
			}
		}
		ois.close();
		System.out.println("FIN PROCESO");
		System.out.println(personas);
	}

}
