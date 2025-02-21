package _pruebas.excepciones.masejemplos;

class Caja {
	private int x;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}

public class Main {

	public static void main(String[] args) {
		Caja caja = new Caja();
		int resultado = dividir(3000, 2, caja);
		 if ( resultado  == -1 ) {
			 System.out.println("El divisor es cero");
		 }
		 else if (resultado == -2) {
			 System.out.println("El dividendo no puede ser superior a 2000");
		 }
		 else {
			 System.out.println(caja.getX());
		 }
		 
		 System.out.println("FIN");
	}

	public static int dividir(int dividendo, int divisor, Caja resultado) {
		int status = 0;
		if (divisor == 0) {
			status = -1;
		}
		else if (dividendo > 2000) {
			status = -2;
		}
		else {
			resultado.setX(dividendo / divisor );
		}
		return status;
	}
}
