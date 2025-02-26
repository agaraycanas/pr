package t10.ej03;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String ruta_a_files = "../src/t10/_files/";
		
		String nombre = args[0];
		int n = Integer.parseInt(args[1]);
		
		for (int i=1;i<=n;i++) {
			try {
				FileWriter f;
				f = new FileWriter(ruta_a_files + nombre + i + ".txt");
				f.write("Fichero "+i);
				f.close();
			} catch (IOException e) {
				System.out.println("ERROR al procesar el fichero");
				e.printStackTrace();
			}
		}
		
	}

}
