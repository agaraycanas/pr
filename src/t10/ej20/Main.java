package t10.ej20;

import static t10._util.Ficheros.leer;
import java.util.List;
import static t10._util.Ficheros.escribir;

public class Main {

	private static List<String> palabrasADestacar;

	public static void main(String[] args) {
		palabrasADestacar = leer("palabras.txt");
		List<String> lineas = leer("e.txt", args.length > 0, true);

		escribir("s.htm", "", false, args.length > 0);
		for (String linea : lineas) {
			linea = procesar(linea);
			escribir("s.htm", linea, true, args.length > 0);
		}
		System.out.println("PROCESADO");
	}

	private static String procesar(String linea) {
		String sol = linea;
		for (String palabraADestacar : palabrasADestacar) {
			sol = sol.replaceAll(palabraADestacar, "<b><i>" + palabraADestacar + "</i></b>");
		}
		return sol;
	}

}
