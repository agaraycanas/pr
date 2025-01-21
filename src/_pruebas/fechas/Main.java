package _pruebas.fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	public static boolean esFinde(LocalDate fecha) {
		return 	fecha.getDayOfWeek() == DayOfWeek.SATURDAY ||
				fecha.getDayOfWeek() == DayOfWeek.SUNDAY
				;
	}

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println(esFinde(hoy) 			? "SI" : "NO");
		System.out.println(esFinde(hoy.plusDays(3)) ? "SI" : "NO");
		System.out.println(esFinde(hoy.plusDays(4)) ? "SI" : "NO");
		System.out.println(esFinde(hoy.plusDays(5)) ? "SI" : "NO");
		System.out.println(esFinde(hoy.plusDays(6)) ? "SI" : "NO");
	}
}
