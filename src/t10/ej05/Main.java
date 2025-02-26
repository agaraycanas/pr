package t10.ej05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String nombreDirectorio = args[0];
		System.out.println("Borrando directorio " + nombreDirectorio);
		borrarDirectorio(nombreDirectorio);
	}

	private static void borrarDirectorio(String nombreDirectorio) {
		String ruta = "../src/t10/_files/";
		Path directorio = Paths.get(ruta+nombreDirectorio);

        try {
        	if (Files.deleteIfExists(directorio)) {
        		System.out.println("Directorio eliminado con éxito.");
        	}
        	else {
        		System.out.println("El directorio "+nombreDirectorio+" no existe");
        	}
        } catch (Exception e) {
            System.out.println("El directorio "+nombreDirectorio+" no está vacío");
            System.out.println("Estás seguro de que quieres borrarlo (s/n)?: ");
            Scanner s = new Scanner(System.in);
            String respuesta = s.next();
            if (respuesta.equals("s") || respuesta.equals("S")) {
            	File d = directorio.toFile();
            	File[] ficherosABorrar = d.listFiles();
            	
            	System.out.println("Borrando contenido del directorio");
            	 for ( File f : ficherosABorrar )  {
            		f.delete(); 
            	}
            	try { // Borrado del directorio ya vacío
            		System.out.println("Borrando directorio");
					Files.deleteIfExists(directorio);
					System.out.println("Directorio borrado");
				} catch (IOException e1) {
					System.out.println("Algo fue mal");
					//e1.printStackTrace();
				}
            }
        }

	}
}
