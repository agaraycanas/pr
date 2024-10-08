package t1;

import java.util.Scanner;

public class Ej20 {

	public static int horasMinutosYSegundosASegundos(int horas, int minutos, int segundos) {
		int totalSegundos = 0;
		final int SPH = 60 * 60;

		totalSegundos = (horas * SPH) + (minutos * 60) + segundos;
		return totalSegundos;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce horas (0-24): ");
		int horas = scan.nextInt();

		System.out.print("Introduce minutos (0-60): ");
		int minutos = scan.nextInt();

		System.out.print("Introduce segundos (0-60): ");
		int segundos = scan.nextInt();

		System.out.println(
				horas + 
				" horas, " + 
				minutos + 
				" minutos y " + 
				segundos + 
				" segundos son "+ 
				horasMinutosYSegundosASegundos(horas, minutos, segundos) +
				" segundos en total");
	}
}
