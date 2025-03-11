package t10.ej12;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import t10._util.Ficheros;

public class Main {
	
	private static int max(Collection<Integer> a) {
		int sol = Integer.MIN_VALUE;
		for ( int e : a) {
			sol = e>sol ? e : sol; 
		}
		return sol;
	}
	
	public static void main(String[] args) {
		
		List<String> nombres = Ficheros.leer("nombres.txt", true, true);
		HashMap<String,Integer> frecuenciaNombres = new HashMap<>(); 
		
		for ( String nombre : nombres) {
			if (frecuenciaNombres.keySet().contains(nombre) ) {
				frecuenciaNombres.put(nombre,  frecuenciaNombres.get(nombre)+1 );
			}
			else {
				frecuenciaNombres.put(nombre,1);
			}
		}
		System.out.println(frecuenciaNombres);
		int max = max( frecuenciaNombres.values());
		String nombreMaximo = "";
		
		for ( String nombre : frecuenciaNombres.keySet() ) {
			int veces = frecuenciaNombres.get(nombre);
			if (veces == max ) {
				nombreMaximo = nombre;
			}
		}
		
		System.out.println(nombreMaximo + " aparece " + max + " veces");
		
		
	}
}
