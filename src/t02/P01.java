package t02;

import java.util.Scanner;

public class P01 {
	public static String titulo(int n, int k, boolean repetir, boolean orden) {
		String tituloFinal = "STANDARD";
		if (orden) {
			if (repetir) {
				tituloFinal = "Variaciones CON repetición de " + n + " elementos tomados de " + k + " en " + k;
			} else {
				if (n==k) {
					tituloFinal = "Permutaciones de " + n + " elementos";
				}
				else {
					tituloFinal = "Variaciones de " + n + " elementos tomados de " + k + " en " + k;
				}
			}
		} else {
			if (repetir) {
				tituloFinal = "Combinaciones CON repetición de " + n + " elementos tomados de " + k + " en " + k;
			} else {
				tituloFinal = "Combinaciones de " + n + " elementos tomados de " + k + " en " + k;
			}
		}
		return tituloFinal + "\n=====================================================\n";
	}

	public static String tituloCorto(int n, int k, boolean repetir, boolean orden) {
		String tituloFinal = "STANDARD";
		if (orden) {
			if (repetir) {
				tituloFinal = "VR (" + n + "," + k + ")";
			} else {
				if (n==k) {
					tituloFinal = "P (" + n + ")";
				}
				else {
					tituloFinal = "V (" + n + "," + k + ")";
				}
			}
		} else {
			if (repetir) {
				tituloFinal = "CR (" + n + "," + k + ")";
			} else {
				tituloFinal = "C (" + n + "," + k + ")";
			}
		}
		return tituloFinal;
	}

	public static long solucion(int n, int k, boolean repetir, boolean orden) {
		long solucion = 0;
		if (orden) {
			if (repetir) {
				solucion = vr(n, k);
			} else {
				solucion = v(n, k);
			}
		} else {
			if (repetir) {
				solucion = cr(n, k);
			} else {
				solucion = c(n, k);
			}
		}
		return solucion;
	}

	public static long fact(int n) {
		long acumulado = 1;
		for (long i = 2; i <= n; i++) {
			acumulado *= i;
		}
		return acumulado;
	}

	public static long cr(int n, int k) {
		return c(n+k-1,k);
	}

	public static long c(int n, int k) {
		long num = 1;
		long den = (k < (n / 2)) ? fact(k) : fact(n - k);
		long cota = (k < (n / 2)) ? (n - k + 1) : (k + 1);
		for (long i = n; i >= cota; i--) {
			num = num * i;
		}
		return num / den;
	}

	public static long vr(int n, int k) {
		long solucion = 1;
		for (int i=0; i<k ; i++) {
			solucion = solucion * n;
		}
		return solucion;
	}

	public static long v(int n, int k) {
		long solucion = 1;
		for (int i=n; i>=n-k+1 ; i--) {
			solucion = solucion * i;
		}
		return solucion;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce n: ");
		int n = scan.nextInt();

		System.out.print("Introduce k: ");
		int k = scan.nextInt();

		System.out.print("Importa el orden (s/n): ");
		String ordenString = scan.next();

		System.out.print("Se pueden repetir los elementos (s/n): ");
		String repetirString = scan.next();

		System.out.println();

		boolean repetir = (repetirString.equals("s")) ? true : false;
		boolean orden = (ordenString.equals("s")) ? true : false;

		System.out.println(titulo(n, k, repetir, orden));
		System.out.println();
		System.out.println(tituloCorto(n, k, repetir, orden) + " = " + solucion(n, k, repetir, orden));
	}

}
