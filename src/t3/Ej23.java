package t3;

import java.util.Arrays;

public class Ej23 {

	//===============================================================
	public static int[] mezclar(int[] a, int[] b, String modo) {
		int[] mezclado = null;
		switch (modo) {
			case "delanteA": mezclado = mezclarDA(a,b);break;
			case "delanteB": mezclado = mezclarDB(a,b);break;
			case "cremalleraA": mezclado = cremaA(a,b);break;
			case "cremalleraB": mezclado = cremaB(a,b);break;
		}
		return mezclado;
	}
	
	//===============================================================
	private static int[] cremaA(int[] a, int[] b) {
		
		int[] mezclado = new int[a.length + b.length];
		int tamPeque = a.length < b.length ? a.length : b.length;
		int tamGrande = a.length > b.length ? a.length : b.length;
		
		// Mezcla en cremallera de la parte común
		for (int i=0;i< tamPeque ;i++) {
			mezclado[  2*i 		]	= a[i];
			mezclado[ (2*i) +1 	] 	= b[i];
		}
		
		// Añadir el resto de a ó b en función de cuál sea el más grande de los dos
		//int c = 2*tamPeque;
		for (int i= tamPeque; i<tamGrande ;i++) {
			mezclado[i+tamPeque] = ( a.length==tamGrande ? a[i] : b[i] ) ;
			//	mezclado[c] = ( a.length==tamGrande ? a[i] : b[i] ) ;
			//	c++;
		}
		
		return mezclado;
	}
	
	//===============================================================
	private static int[] cremaB(int[] a, int[] b) {
		int[] mezclado = new int[a.length + b.length];
		int tamPeque = a.length < b.length ? a.length : b.length;
		int tamGrande = a.length > b.length ? a.length : b.length;
		
		for (int i=0;i< tamPeque ;i++) {
			mezclado[  2*i 		]	= b[i];
			mezclado[ (2*i) +1 	] 	= a[i];
		}
		
		for (int i= tamPeque; i<tamGrande ;i++) {
			mezclado[i+tamPeque] = ( a.length==tamGrande ? a[i] : b[i] ) ;
		}
		return mezclado;
	}
	
	//===============================================================
	private static int[] mezclarDA(int[] a, int[] b) {
		int[] mezclado = new int[a.length + b.length];
		
		for (int i=0; i<a.length; i++) {
			mezclado[i] = a[i];
		}
		for (int i=0; i<b.length; i++) {
			mezclado[i+a.length] = b[i];
		}
		return mezclado;
	}

	//===============================================================
	private static int[] mezclarDB(int[] a, int[] b) {
		int[] mezclado = new int[a.length + b.length];
		
		for (int i=0; i<b.length; i++) {
			mezclado[i] = b[i];
		}
		for (int i=0; i<a.length; i++) {
			mezclado[i+b.length] = a[i];
		}
		return mezclado;
	}
	/*
	private static int[] mezclarDA2(int[] a, int[] b) {
		int[] mezclado = new int[a.length + b.length];
		int c = 0;
		for (int i=0; i<a.length; i++) {
			mezclado[c] = a[i];
			c++;
		}
		for (int i=0; i<b.length; i++) {
			mezclado[c] = b[i];
			c++;
		}
		return mezclado;
	}
	*/

	//===============================================================
	
	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {40,50,60,70,80,90};
		//int[] b = {40,50};
		System.out.println("A: "+Arrays.toString(a));
		System.out.println("B: "+Arrays.toString(b));
		System.out.println("Delante A: "+Arrays.toString(mezclar(a, b, "delanteA")));
		System.out.println("Delante B: "+Arrays.toString(mezclar(a, b, "delanteB")));
		System.out.println("Cremallera A: "+Arrays.toString(mezclar(a, b, "cremalleraA")));
		System.out.println("Cremallera B: "+Arrays.toString(mezclar(a, b, "cremalleraB")));
	}

}
