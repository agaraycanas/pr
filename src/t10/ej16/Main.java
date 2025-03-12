package t10.ej16;

import static t10._util.Ficheros.escribir;
import static t10._util.Ficheros.leer;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] contenido = { 
				"a b c",
				"d e a f",
				"g a h i"};
		List<String> lineas = leer("listanegra.txt");
		String palabraProhibida = lineas.get(0);

		escribir("s.txt", "", false, args.length>0);
		for (String linea : contenido) {
			escribir("s.txt", linea.replaceAll(palabraProhibida, "****"));
		}
		System.out.println("FIN DE PROCESO DE FICHERO");
	}
}
