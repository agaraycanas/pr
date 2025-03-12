package t10.ej17;

import static t10._util.Ficheros.escribir;
import static t10._util.Ficheros.leer;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] contenido = { 
				"En un lugar"
				, "de La Mancha"
				, "de cuyo nombre"
				, "no quiero acordarme"
				, "no ha mucho que vivía"
				, "un caballero"};
				
		List<String> palabrasProhibidas = leer("listanegra.txt");

		escribir("s.txt", "", false, args.length>0);
		for (String linea : contenido) {
			String lineaFinal = linea;
			for ( String palabraProhibida: palabrasProhibidas) {
				lineaFinal = lineaFinal.replaceAll(palabraProhibida, "****");
			}
			//System.out.println(lineaFinal); // TODO DEBUG
			escribir("s.txt", lineaFinal);
		}
		System.out.println("FIN DE PROCESO DE FICHERO");
	}
}
