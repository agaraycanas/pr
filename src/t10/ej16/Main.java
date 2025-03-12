package t10.ej16;

import static t10._util.Ficheros.escribir;

public class Main {

	public static void main(String[] args) {
		String[] contenido = { 
				"a tonto b","a tonto c tonto"};
		String palabraProhibida = args.length>0 ? args[0] : "tonto";

		escribir("s.txt", "", false, args.length>0);
		for (String linea : contenido) {
			
			String[] palabra = linea.split(" ");
			String[] nuevaLinea = new String[palabra.length];
			
			for (int i = 0; i < palabra.length; i++) {
				if (palabra[i].equals(palabraProhibida)) {
					nuevaLinea[i] = "*****";
				} else {
					nuevaLinea[i] = palabra[i];
				}
			}

			escribir("s.txt", String.join(" ",nuevaLinea), true,args.length>0);
		}
		System.out.println("FIN DE PROCESO DE FICHERO");
	}

}
