package t4.b.ej02;

public class A {
	
	static int nObjetos=0;
	
	static int numeroDeObjetos() {
		return nObjetos;
	}
	
	public A() {
		nObjetos++;
	}
}
