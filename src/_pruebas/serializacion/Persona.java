package _pruebas.serializacion;

public class Persona {
	private int dni;
	private String nombre;
	private Persona padre;
	private Persona madre;
	
	
	public Persona getPadre() {
		return padre;
	}
	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	public Persona getMadre() {
		return madre;
	}
	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int dni, String nombre, Persona padre, Persona madre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.padre = padre;
		this.madre = madre;
	}
	
	@Override
	public String toString() {
		return "["+this.dni+"]"+this.nombre + "(" + this.padre.getDni() +","+ this.madre.getDni() +")";
	}
	
	
}
