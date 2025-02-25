package t10._pruebas.rutas;

import java.io.File;
import java.io.IOException;

public class Prueba {
	public static void main(String[] args) {
		System.out.println("Creando fichero");
		String nombre = "c:/tmp/NUEVO.txt"; //args[0];
		File f = new File(nombre);
		try {
			if (f.createNewFile()) {
				System.out.println("Archivo creado");		
			}
			else {
				System.out.println("Archivo existente");
			}
		}
		catch (IOException e) {
			System.out.println("No se pudo crear el archivo");
		}
	}
}