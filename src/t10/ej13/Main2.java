package t10.ej13;

import static t10._util.Ficheros.escribir;;

public class Main2 {

	public static void main(String[] args) {
		String[] contenido = {
				"En un lugar",
				"de La Mancha",
				"de cuyo nombre",
				"no quiero acordarme"
		};
		escribir("s.txt","",false,args.length>0);
		for (String linea  : contenido ) {
			escribir("s.txt", linea, true,args.length>0);
		}
		System.out.println("PROCESADO");
	}

}
