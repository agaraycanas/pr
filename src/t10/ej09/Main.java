package t10.ej09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

	private static Collection<Persona> personas;

	public static void main(String[] args) {
		inicializar();
		coleccionar();
		saludar(args.length>0?args[0]:"da");
	}

	private static void inicializar() {
		personas = new TreeSet<>(new ComparadorNombreAsc());
		//personas = new ArrayList<>();
	}

	private static void coleccionar() {
		String ruta = "src/t10/_files/";
		//String ruta = "../src/t10/_files/";
		String nombre = "clientes.txt";
		FileReader fr = null;
		BufferedReader br = null;
		int nLinea=1;
		try {
			fr = new FileReader( ruta + nombre );
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] dato = linea.split(":");
				Persona persona = new Persona( dato[1] , dato[2], Integer.parseInt( dato[0] ) );
				personas.add(persona);
				nLinea++;
			}
		} catch (Exception e) {
			System.out.println("Error al leer "+nLinea);
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void saludar(String criterio) {
		
		System.out.println("Ordenando personas");
		/*
		switch (criterio) {
			case "na":Collections.sort((List)personas,new ComparadorNombreAsc());break;
			case "nd":Collections.sort((List)personas,new ComparadorNombreDesc());break;
			case "da":Collections.sort((List)personas,new ComparadorDNIAsc());break;
			case "dd":Collections.sort((List)personas,new ComparadorDNIDesc());break;
		}
		*/
		System.out.println("Personas saludando");
		for ( Persona persona : personas ) {
			persona.saludar();
		}
	}

}
