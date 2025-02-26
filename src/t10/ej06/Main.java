package t10.ej06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static String ruta = "../src/t10/_files/";

	public static void main(String[] args) {
		int n = args.length>0 ? Integer.parseInt(args[0]) : 1;
		
		crearDirectorio("uno");
		crearDirectorio("dos");
		crearDirectorio("tres");
		
		crearFicheros(n);
		
	}

	private static void crearFicheros(int n) {
	
		for (int i=1;i<=n;i++) {
			crearFichero(i,"uno");
		}
	}
	
	private static void crearFichero(int indice, String carpeta) {
		String nombreFichero = ruta + carpeta + "/" +"f" + indice + ".txt";
		String contenido = "TEST";

		        try (FileWriter escritor = new FileWriter(nombreFichero)) {
		            escritor.write(contenido);
		            System.out.println("f" + indice + " creado ");
		            escritor.close();
		        } catch (IOException e) {
		            System.out.println("Ocurrió un error al crear f" + indice);
		        }
	}

	private static void crearDirectorio(String nombre) {
		System.out.println("===============");
		System.out.println("Creando directorio "+nombre);
		String nombreCompleto = ruta + nombre;
		File directorio = new File(nombreCompleto);

        if (directorio.mkdir()) {
            System.out.println("Directorio creado: " + directorio.getAbsolutePath());
        } else {
            System.out.println("El directorio ya existe o no pudo ser creado.");
        }

	}

}
