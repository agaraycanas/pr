package t4.__introOO.ej08;

public class Prueba {

	public static void main(String[] args) {
		 Persona pepe = new Persona();
		 pepe.nombre = "Pepe";
		 pepe.edad=18;
		 pepe.saludar();
		 
		 Persona ana = new Persona();
		 ana.nombre = "Ana";
		 ana.edad = 40;
		 ana.saludar();

		 Persona aux = pepe;
		 aux.saludar();

		 ana = aux;
		 ana.saludar();

	}

}
