package t10.ej18;

import static t10._util.Ficheros.leer;
import java.util.List;
import static t10._util.Ficheros.escribir;

public class Main {

	private static String palabraADestacar;
	
	public static void main(String[] args) {
		palabraADestacar = args.length>0 ?args[0]:"oro";
		List<String> lineas = leer("e.txt",args.length>0,true);
		//System.out.println(lineas); //TODO DEBUG
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
