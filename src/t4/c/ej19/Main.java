package t4.c.ej19;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una fecha notable del pasado: ");
		
		System.out.println("Año: ");
		int y = sc.nextInt();

		System.out.println("Mes: ");
		int m = sc.nextInt();

		System.out.println("Día: ");
		int d = sc.nextInt();

		// =============================
		
		LocalDate fecha = LocalDate.of(y, m, d);
		LocalDate hoy = LocalDate.now();

		Period intervalo = Period.between(fecha, hoy);

		int nAnyos = intervalo.getYears();
		int nMeses = intervalo.getMonths();
		int nDias= intervalo.getDays();
		
		//=================================
		
		System.out.println(
						"Han transcurrido "+
						nAnyos+" años, "+
						nMeses+" meses y "+
						nDias+" días desde el "+
						fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
						);
	}

}
