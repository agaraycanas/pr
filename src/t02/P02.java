package t02;

public class P02 {

	public static void main(String[] args) {
		String sistema = "S.I.";
		double e = 4, m = 1, t = 10;

		System.out.println("CONVERSOR DE MAGNITUDES FÍSICAS");
		System.out.println("============");
		System.out.println("Sistema actual: " + sistema);
		System.out.println();

		System.out.println("Unidades fundamentales");
		System.out.println("======================");
		System.out.println("Espacio: " + e + " "+ unidades(sistema, "espacio"));
		System.out.println("Masa: " + m +  " "+  unidades(sistema, "masa"));
		System.out.println("Tiempo: " + t +  " "+ unidades(sistema, "tiempo"));

		System.out.println();
		System.out.println("Unidades derivadas");
		System.out.println("==================");
		System.out.println("Velocidad (e/t): " + (e/t) + " "+ unidades(sistema,"velocidad"));
		System.out.println("Velocidad (e/t02): " + (e/(t*t)) + " "+ unidades(sistema,"aceleracion"));

	}

	public static String unidades(String sistema, String magnitud) {
		String solucion = "";
		switch (sistema) {
		case "S.I.":
			switch (magnitud) {
			case "espacio":
				solucion = "m";
				break;
			case "masa":
				solucion = "kg";
				break;
			case "tiempo":
				solucion = "s";
				break;
			case "velocidad":
				solucion = "m/s";
				break;
			case "aceleracion":
				solucion = "m/s2";
				break;
			}
			break;
		case "cgs":
			switch (magnitud) {
			case "espacio":
				solucion = "cm";
				break;
			case "masa":
				solucion = "g";
				break;
			case "tiempo":
				solucion = "s";
				break;
			case "velocidad":
				solucion = "cm/s";
				break;
			case "aceleracion":
				solucion = "m/s2";
				break;

			}
			
			break;
		}
		return solucion;
	}
}
