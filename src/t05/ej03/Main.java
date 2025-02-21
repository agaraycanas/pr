package t05.ej03;

import java.util.Arrays;

import t05.ej02.Persona;

public class Main {

	public static void main(String[] args) {
		
		int nPersonas = Integer.parseInt(args[0]);
		
		Persona[] personas = new Persona[nPersonas];
		
		for (int i=0;i<nPersonas;i++) {
			personas[i] = new Persona(Integer.parseInt( args[ i*3+1 ] ) , args[ i*3+2 ] , args[ i*3+3 ] );
		}
		
		System.out.println(Arrays.toString(personas));
		System.out.println(Arrays.toString(burbuja(personas)));
	}

	public static Persona[] clonar(Persona[] a) {
		Persona[] nuevo;
		nuevo = new Persona[a.length];
		for (int i = 0; i < a.length; i++) {
			nuevo[i] = a[i];
		}
		return nuevo;
	}

	public static Persona[] burbuja(Persona[] original) {
		Persona[] copia = clonar(original);
		//System.out.println(Arrays.toString(copia)); //TODO DEBUG

		for (int limite = copia.length - 2; limite >= 0; limite--) {
			for (int i = 0; i <= limite; i++) {
				if ( copia[i].compareTo(copia[i + 1]) > 0 ){
					swap(copia, i, i + 1);
				}
				//System.out.println(Arrays.toString(copia)); //TODO DEBUG
			}
		}
		return copia;
	}

	public static void swap(Persona[] a, int i, int j) {
		Persona aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

}
