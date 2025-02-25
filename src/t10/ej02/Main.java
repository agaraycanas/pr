package t10.ej02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			String contenido = String.join(" ", args);
			FileWriter f = new FileWriter("../" + args[0] + ".txt");
			f.write(contenido);
			System.out.println("Archivo creado");
			f.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
		System.out.println("FIN");
	}

}
