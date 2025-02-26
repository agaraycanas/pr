package t10._pruebas.borrado;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		//crearArchivo();
		borrarArchivo();
	}

	private static void borrarArchivo() {
		String ruta = "src/t10/_pruebas/borrado/";
		Path archivo = Paths.get(ruta+"archivo.txt");

        try {
            Files.deleteIfExists(archivo);
			//archivo.delete();
            System.out.println("Archivo eliminado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al eliminar el archivo.");
            e.printStackTrace();
        }
	}

	private static void crearArchivo() {
		String ruta = "src/t10/_pruebas/borrado/";
		File archivo = new File(ruta+"archivo.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();
        }
	}

}
