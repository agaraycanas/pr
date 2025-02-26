package t10.ej04;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
            System.out.println("Error al eliminar el directorio.");
            System.out.println("El directorio "+nombreDirectorio+" no está vacío");
            //e.printStackTrace();
        }

	}
}
