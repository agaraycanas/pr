package t4.__introOO.ej04;

public class Prueba {

	public static void main(String[] args) {
		 Persona pepe = new Persona();
		 
		 System.out.println("NOMBRE: " + pepe.nombre);
		 System.out.println("EDAD: "+pepe.edad);
		 
		 pepe.nombre = "Pepe";
		 pepe.edad = 18;

		 System.out.println("NOMBRE: " + pepe.nombre);
		 System.out.println("EDAD: "+pepe.edad);

	}

}
