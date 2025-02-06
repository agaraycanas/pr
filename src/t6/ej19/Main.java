package t6.ej19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import t6.ej00.Humano;
import t6.ej00.Perro;

public class Main {

	public static void main(String[] args) {
		List<Humano> humanos = new ArrayList<>();
		
		for (int i=0; i<args.length;i+=2) {
			int 	dni		= Integer.parseInt (	args[i]		);
			String 	nombre 	= 						args[i+1];
			humanos.add( new Humano(dni, nombre) );
		}
		
		System.out.println( humanos );
		
		Scanner s = new Scanner(System.in);
		System.out.print("Dame un DNI: ");
		int dni = s.nextInt();
	
		/* Recorremos colección
		 * Si el elemento actual, su dni coincide con el introducido
		 * entonces mostraré su nombre.
		 * Si no, sigo recorriendo
		 */
		boolean esta = false;
		
		//for ( Humano humano : humanos ) {
		Iterator<Humano> i = humanos.iterator();	// Con iterador
		while (i.hasNext()) {						// Con iterador
			Humano humano = i.next(); 				// Con iterador
			if ( humano.getDni() == dni ) {
				System.out.println( "Lo tengo, se llama ..."+humano.getNombre() );
				esta = true;
			}
		}
		
		System.out.println( !esta ? "No existe" : "");
	}
}
