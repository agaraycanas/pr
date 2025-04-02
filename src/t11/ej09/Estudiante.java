package t11.ej09;

public class Estudiante {
	private String nombre;
	private String calificacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public Estudiante(String nombre, String calificacion) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
	}
	
	@Override
	public String toString() {
		return this.nombre+" ("+this.calificacion+")";
	}
}
