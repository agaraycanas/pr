package pruebas;

public class Prueba {
	public static void main(String[] args) {
		String cadenaDeSaludo = "Qué tal estás";
		for (int i = 0; i < args.length; i++) {
			cadenaDeSaludo += (" " + args[i]);
		}
		System.out.println(cadenaDeSaludo);

	}
}