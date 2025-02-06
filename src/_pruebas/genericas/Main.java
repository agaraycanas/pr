package _pruebas.genericas;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pastel> coleccion = new ArrayList<Pastel>();
		
		for (int i=0; i<=10;i++) {
			if (new Random().nextInt(2)%2 == 0) {
				//coleccion.add( new Cactus() );
			}
			else {
				coleccion.add( new Pastel() );
			}
		}
		System.out.println(coleccion);
	}

}
