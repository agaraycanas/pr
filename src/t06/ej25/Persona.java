package t06.ej25;

import java.time.LocalDate;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	private LocalDate fNac;

	// ============================
	public Persona(int dni, String nombre, String apellido, LocalDate fNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNac = fNac;
	}

	// ============================

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getfNac() {
		return fNac;
	}

	public void setfNac(LocalDate fNac) {
		this.fNac = fNac;
	}

}
