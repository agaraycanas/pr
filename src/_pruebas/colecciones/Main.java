package _pruebas.colecciones;

import java.util.ArrayList;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		
		ArrayList bolsa = new ArrayList();
		ArrayList otraBolsa = new ArrayList();

		bolsa.add(new Persona("1","A","B"));
		bolsa.add(new Persona("2","C","D"));
		bolsa.add(new Persona("3","E","F"));
		bolsa.add(new Persona("4","G","H"));

		otraBolsa.add(new Persona("3","E","F"));
		otraBolsa.add(new Persona("7","A","B"));
		
		Object[] a = {1,2};
		Object[] ao = bolsa.toArray(a);
		
		for (int i=0; i<ao.length; i++) {
			System.out.println( ao[i ]);
		}

		
	}

}
