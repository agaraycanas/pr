package t4._desarrolloClases.ej13;

public class Main {

	public static void main(String[] args) {
		Persona padre = new Persona("XXX-ignorado","Pérez","Santos");
		Persona madre = new Persona("YYY-ignorado","Manzano","Borreguero");
		
		Persona.mostrarApellidos(padre, madre);
	}

}