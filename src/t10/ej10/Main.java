package t10.ej10;

import java.util.List;

import t10._util.Ficheros;

public class Main {
	public static void main(String[] args) {
		String nombreABuscar = args.length>0 ? args[0] : "ana";
		List<String> nombres = Ficheros.leer("nombres.txt", false, true);
		int contador = 0;
		for ( String nombre : nombres) {
			if (nombreABuscar.equals(nombre)) {
				contador++;
			}
		}
		System.out.println(nombreABuscar + " aparece " + contador +" veces");
	}
}
