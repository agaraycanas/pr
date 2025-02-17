package _pruebas.excepciones;

public class Uno {
	public static void main(String[] args) throws Exception {
		try {
			(new Uno()).uno();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uno() throws Exception {
		new Dos().dos();
	}
}
