package _pruebas.encapsulacion.p1;

public class A {
	public 		String aPublico 	= "A. PUBLICO";
	protected 	String aProtegido 	= "A. PROTEGIDO";
				String aPaquete 	= "A. PAQUETE";
	private		String aPrivado 	= "A. PRIVADO";

	//===============================================
	public 		void publico() {
		System.out.println("M. PUBLICO");
	}
	protected 	void protegido() {
		System.out.println("M. PROTEGIDO");
	}
	
				void paquete() {
		System.out.println("M. PAQUETE");
	}
				
	private		void privado() {
		System.out.println("M. PRIVADO");
	}
	
	public void metodo() {
		System.out.println("=== A TRAVÉS DE MÉTODO PÚBLICO ===");
		this.privado();
		System.out.println(this.aPrivado);
	}
	
}
