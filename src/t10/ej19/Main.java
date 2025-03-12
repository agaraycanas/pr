package t10.ej19;

import static t10._util.Ficheros.leer;
import java.util.List;
import static t10._util.Ficheros.escribir;

public class Main {

	private static String palabraADestacar;
	
	public static void main(String[] args) {
		List<String> palabrasADestacar = leer("palabras.txt");
		palabraADestacar = palabrasADestacar.get(0);
		List<String> lineas = leer("e.txt",args.length>0,true);
		escribir("s.htm", "",false,args.length>0);
		for ( String linea : lineas) {
			linea = procesar(linea);
			escribir("s.htm", linea,true,args.length>0);
		}
		System.out.println("PROCESADO");
	}

	private static String procesar(String linea) {
		return linea.replaceAll(
				palabraADestacar, 
				"<b><i>" + palabraADestacar +"</i></b>"
				);
	}

}
