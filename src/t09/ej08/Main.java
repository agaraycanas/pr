package t09.ej08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int tiradas = Integer.parseInt(args[0]);
		int caras = Integer.parseInt(args[1]);
		int[] f = new int[11];
		Random r = new Random();
		for (int i = 0; i < tiradas; i++) {
			int posicion = r.nextInt(caras) + 1;
			try {
				f[posicion]++;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				f[0]++;
			}
		}
		mostrarEstadisticas(f, tiradas, caras);
	}

	private static void mostrarEstadisticas(int[] f, int tiradas, int caras) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(
					"Cara " + i + ": " + f[i] + "/" + tiradas + 
					"\t(" + ((f[i] / (float) tiradas) * 100) + "%)"
			);
		}
		System.out.println("Fuera de rango 1-"+caras+": "+f[0]+"/"+tiradas+"\t("+
				((f[0] / (float) tiradas) * 100) + "%)"
				);
	}

}
