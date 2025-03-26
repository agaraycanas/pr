package t09.ej03;

public class Main {
	public static void main(String[] args) {
		Bomba b = new Bomba();
		try {
			System.out.println("Inicio bloque");
			
			// b.a();  // 1
			// b.b();  // 2
			// b.c1(); // 3
			// b.c2(); // 4

			System.out.println("Fin bloque");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Fin programa");
	}

}

class Bomba {
	public void a() throws A {
		throw (new A());
	}

	public void b() throws B {
		throw (new B());
	}

	public void c1() throws C {
		throw (new C());
	}

	public void c2() throws C {
		int n = 10;
		if (n < 10) {
			throw (new C());
		}
	}
}

class A extends Exception {
	public String toString() {
		return "aS";
	}

	public String getMessage() {
		return "aM";
	}
}

class B extends Exception {
	public String getMessage() {
		return "bM";
	}
}

class C extends Exception {
	public String toString() {
		return "cS";
	}
}
