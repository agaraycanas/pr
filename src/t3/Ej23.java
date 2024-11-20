package t3;

public class Ej23 {

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
	
	private static int[] cremaB(int[] a, int[] b) {
		return null;
	}
	private static int[] cremaA(int[] a, int[] b) {
		return null;
	}
	private static int[] mezclarDB(int[] a, int[] b) {
		return null;
	}
	private static int[] mezclarDA(int[] a, int[] b) {
		return null;
	}
	
	public static void main(String[] args) {

	}

}
