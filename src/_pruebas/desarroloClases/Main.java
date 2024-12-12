package _pruebas.desarroloClases;

public class Main {

	public static void main(String[] args) {
		Coche coche = new Coche();
		
		coche.dd = new Rueda();
		coche.di = new Rueda();
		coche.ti = new Rueda();
		coche.td = new Rueda();
		
		coche.di.presion -= 0.5;

		coche.diagnostico();
	}

}
