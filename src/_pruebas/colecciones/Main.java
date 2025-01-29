package _pruebas.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	private static  void mostrar(Cromo[] x) {
		for (int i=0; i<x.length ;i++) {
			System.out.println( x[i] );
		}
	}
	
	private static  void mostrarLista(Collection x) {
		//TODO
	}

	public static void main(String[] args) {
		Cromo c1 = new Cromo(1);
		Cromo c2 = new Cromo(2);
		Cromo c3 = new Cromo(3);
		Cromo c4 = new Cromo(4);
		Cromo c5 = new Cromo(4);

		
		Cromo[] cromos = new Cromo[4];
		cromos[0] = c1; 
		cromos[1] = c2; 
		cromos[2] = c3; 
		cromos[3] = c4;
		
		ArrayList bolsa = new ArrayList();
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3);
		bolsa.add(c4);
		bolsa.add(c5);
		
		mostrar( cromos );
		mostrarLista(bolsa);
		
	}

}
