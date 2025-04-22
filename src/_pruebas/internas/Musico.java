package _pruebas.internas;

public class Musico {
	
	private Instrumento i1;
	private Instrumento i2;
	
	public Musico() {
		/*
		this.i1 = new Instrumento() {
			public void sonar() {
				System.out.println("PUEET");
			}
		};
		*/
		this.i1 = () -> {System.out.println("PUEET");};
	}
	
	public void tocar() {
		this.i1.sonar();
		this.i2.sonar();
	}
}
