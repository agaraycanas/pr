package _pruebas.excepciones.tipos;

public class Main {
	public static void main(String[] args) throws MiExcepcion {
		try {
			m2();
		} catch (Throwable e) {
			System.out.println("HA ocurrido un error");
		}
		System.out.println("FIN");
	}

	private static void m2() {
		throw new MiError();
		// throw new ExcepcionUnchecked();
		// throw new MiExcepcion();
	}

	private static void m1() throws MiExcepcion {
		throw new MiExcepcion();
	}
}
