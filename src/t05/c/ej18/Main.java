package t05.c.ej18;

public class Main {

	public static void main(String[] args) {
		Persona[] persona = new Persona[5];
		
		persona[0] = new Persona("Alberto","Garay","Cañas","Español");
		persona[1] = new Persona("Francois","Cruasan","Cruasan","Francesa");
		persona[2] = new Persona("Helmut","Koln","Koln","Alemán");
		persona[3] = new Persona("Ana","García","García","Española");
		persona[4] = new Persona("Perico","Períquez","Períquez","Peruano");

		for (int i=0;i<persona.length;i++) {
			System.out.println(persona[i]);
		}

	}
}
