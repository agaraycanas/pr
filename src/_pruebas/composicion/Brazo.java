package _pruebas.composicion;

public class Brazo {
	
	private Dedo pulgarIzq;
	
	public Brazo() {
		this.pulgarIzq = new Dedo();
	}
	public Dedo getPulgarIzq() {
		return pulgarIzq;
	}
	
	public void setPulgarIzq(Dedo pulgarIzq) {
		this.pulgarIzq = pulgarIzq;
	}
	
	public String toString() {
		return "BRAZO ## "+this.pulgarIzq;
	}
}
