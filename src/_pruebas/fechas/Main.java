package _pruebas.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy);
		System.out.println(
				hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				);

		
		LocalDate navidad = LocalDate.of(1978, 12, 25);
		System.out.println(
				navidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				);
	}

}
