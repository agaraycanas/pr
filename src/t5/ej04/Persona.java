package t5.ej04;

public class Persona implements Comparable {
	
	private int dni;
	private String nombre;
	private String apellido;
	
	public Persona(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return  "("+this.dni+") "+this.nombre+" "+this.apellido;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public int compareTo(Object o) {
		Persona otra = (Persona)o;
		return ordenarPorDNI(otra);
		//return ordenarPorApellidoNombre(otra);
	}

	//============================================================
	private int ordenarPorApellidoNombre(Persona otra) {
		int sol = 0;
		
		if (this.apellido.compareTo( otra.apellido) > 0 ) {
			sol = 1;
		}
		
		if (this.apellido.compareTo( otra.apellido ) < 0  ) {
			sol = -1;
		}

		if (this.apellido.compareTo(otra.apellido) == 0 ) {
			if (this.nombre.compareTo( otra.nombre ) > 0) {
				sol = 1;
			}
			if (this.nombre.compareTo( otra.nombre) < 0 ) {
				sol = -1;
			}
		}
		return sol;
	}
	
	private int ordenarPorDNI(Persona otra) {
		int sol = 0;
		if (this.dni > otra.dni ) {
			sol = 1;
		}
		if (this.dni < otra.dni ) {
			sol = -1;
		}

		return sol;
	}

	//============================================================

}
