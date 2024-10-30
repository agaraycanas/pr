package pruebas;


class Prueba {

	public static void main(String[] args) {
		double longitudGrados=0, longitudMinutos=0, longitudSegundos=0;
		double latitudGrados = 0, latitudMinutos = 0, latitudSegundos=0;
		System.out.println(
				temperatura(
						longitudGrados, longitudMinutos, 	longitudSegundos, 
						latitudGrados, 	latitudMinutos,		latitudSegundos
						)
				);
	}

	public static double temperatura(double longitudGrados, double longitudMinutos, double longitudSegundos,
			double latitudGrados, double latitudMinutos, double latitudSegundos) {
		return 0;
	}
}