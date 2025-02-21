package t01;

import java.util.Scanner;

public class Ej21 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce segundos: ");
		int segundos = scan.nextInt();

		final int SPD = 24 * 60 * 60; 
		int dias = segundos / SPD ;
		int segundosRestantes = segundos % SPD;
		
		final int SPH = 60 * 60;
		int horas = segundosRestantes / SPH ;
		segundosRestantes = segundosRestantes % SPH ;
		
		final int SPM = 60;
		int minutos = segundosRestantes / SPM ;
		segundosRestantes = segundosRestantes % SPM ;

		System.out.println(
				segundos + 
				" segundos son " +
				dias +
				" días , " +
				horas +
				" horas, " +
				minutos +
				" minutos y " +
				segundosRestantes +
				" segundos."
				);
	}
}
