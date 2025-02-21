package t06.ej03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import t06.ej00.Gato;
import t06.ej00.Humano;
import t06.ej00.Perro;

public class Main {
	public static void main(String[] args) {
		Humano h1 = new Humano(1,"Pepe");
		Humano h2 = new Humano(1,"Pepe");
		Humano h3 = new Humano(2,"María");

		System.out.println("h1=h2 "+h1.equals(h2));
		System.out.println("h1=h3 "+h1.equals(h3));
		System.out.println("h2=h3 "+h2.equals(h3));
		
		Perro p1 = new Perro(1,20);
		Perro p2 = new Perro(1,20);
		Perro p3 = new Perro(2,50);

		System.out.println("p1=p2 "+p1.equals(p2));
		System.out.println("p1=p3 "+p1.equals(p3));
		System.out.println("p2=p3 "+p2.equals(p3));
		
		Gato g1 = new Gato("A",20);
		Gato g2 = new Gato("A",20);
		Gato g3 = new Gato("A",50);

		System.out.println("g1=g2 "+g1.equals(g2));
		System.out.println("g1=g3 "+g1.equals(g3));
		System.out.println("g2=g3 "+g2.equals(g3));
		
	}
}
