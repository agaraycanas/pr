package t11.ej09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {


	private static List<Estudiante> l = List.of(
			new Estudiante("e1","sobresaliente"),
			new Estudiante("e2","sobresaliente"),
			new Estudiante("e3","sobresaliente"),
			new Estudiante("e4","sobresaliente"),
			new Estudiante("e5","notable"),
			new Estudiante("e6","notable"),
			new Estudiante("e7","suficiente"),
			new Estudiante("e8","suficiente"),
			new Estudiante("e9","suficiente"),
			new Estudiante("e10","suspenso"),
			new Estudiante("e11","suspenso")
			);

	public static void main(String[] args) {
		System.out.println("CLASICO");
		procesarClasico();
		System.out.println("STREAM");
		procesarStream();
		System.out.println("ORIGINAL");
		System.out.println(l);
	}

	private static void procesarClasico() {
		List<Estudiante> listaFinal = new ArrayList<>();
		for (Estudiante e : l) {
			if (	e.getCalificacion().equals("sobresaliente") || 
					e.getCalificacion().equals("notable")) {
				listaFinal.add(e);
			}
		}

		System.out.println("[c] Número de SB/NT: "+listaFinal.size());
	}

	private static void procesarStream() {
		System.out.println("[s] Número de SB/NT: "+
				l.stream()
					.filter (e-> 
								e.getCalificacion().equals("sobresaliente") ||
								e.getCalificacion().equals("notable") 
							)
					.count()
					/*
					.collect(Collectors.toList())
					.size()
					*/
				);

	}
}
