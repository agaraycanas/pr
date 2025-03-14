package _pruebas.serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("serial.txt"); // (ruta,true) para añadir
			pw = new PrintWriter(fw);
			pw.println(new Persona("1","Pepe"));
			 try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.txt"))) {
		            oos.writeObject(new Persona("2","JUAN"));
		            System.out.println("Objeto serializado.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			 try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.txt"))) {
		            Persona personaDeserializada = (Persona) ois.readObject();
		            System.out.println("Objeto deserializado: " + personaDeserializada);
		        } catch (IOException | ClassNotFoundException e) {
		            e.printStackTrace();
		        }
			System.out.println("FIn");
		} catch (Exception e) {
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
			}
		}

	}

}
