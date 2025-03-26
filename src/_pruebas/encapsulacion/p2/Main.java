package _pruebas.encapsulacion.p2;

import _pruebas.encapsulacion.p1.A;

public class Main extends A {
	public Main() {
		this.publico();
		this.protegido();
		//this.paquete();
		//this.privado();
		
		System.out.println(this.aPublico);
		System.out.println(this.aProtegido);
		//System.out.println(this.aPaquete);
		//System.out.println(this.aPrivado);
		
	}
	
	public static void main(String[] args) {
		System.out.println("USO POR HERENCIA");
		new Main();
		
		System.out.println("=========================");
		System.out.println("USO POR COMPOSICION");
		A a = new A();
		a.publico();
		//t05.a.protegido();
		//t05.a.paquete();
		//t05.a.privado();
		System.out.println(a.aPublico);
		//System.out.println(t05.a.aProtegido);
		//System.out.println(t05.a.aPaquete);
		//System.out.println(t05.a.aPrivado);
	}
}
