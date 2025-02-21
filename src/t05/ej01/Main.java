package t05.ej01;

public class Main {

	public static double longitudAzar() {
		return ((int)(Math.random()*901)+100)/100.0;
	}
	
	public static void main(String[] args) {
		Figura[] figuras = new Figura[10];
		
		for (int i=0; i<figuras.length; i++) {
			int azar = (int)(Math.random()*2)+1;
			figuras[i] = ((azar==1) ? new Circulo(longitudAzar()) : new Triangulo(longitudAzar(),longitudAzar()));
		}

		for (int i=0; i<figuras.length; i++) {
			System.out.println(
					figuras[i] + " // area=" + figuras[i].area() 
					) ;
		}
	}

}
