package t10.ej22;

import static t10._util.Ficheros.leer;
import static t10._util.Ficheros.escribir;
import static t10._util.Ficheros.nuevoArchivo;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lineas = leer("e.txt");
		nuevoArchivo("s.txt");
		for ( String linea : lineas ) {
			String primeraPalabra = linea.split(" ")[0];
			escribir("s.txt",primeraPalabra);
		}
		System.out.println("FIN");
	}

}
