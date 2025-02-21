package t06.ej28;

import java.time.LocalDate;
import java.util.Objects;

public class Persona  {
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
	@Override
	public String toString() {
		return "(" + this.dni + ") " + this.apellido +
				", " +  this.nombre + " [ " + this.fNac + " ]";
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getfNac() {
		return fNac;
	}
	
	@Override
	public int hashCode() {
		Persona yo = (Persona)this;
		return yo.dni;
	}

	public void setfNac(LocalDate fNac) {
		this.fNac = fNac;
	}

	/*
	public int compareTo(Persona otra) {
		int sol = 0;
		if ( this.dni > otra.dni) {
			sol = 1;
		}
		if ( this.dni < otra.dni) {
			sol = -1;
		}
		
		return sol;
	}
	*/

}
