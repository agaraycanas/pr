package t6.ej05;

import t6.ej00.Humano;
import t6.ej00.Perro;

public class Main {
	public static void main(String[] args) {
		Humano  p1 = new Humano(1,"Pepe");
		Humano  p2 = new Humano(1,"Pepe");
		Humano  p3 = new Humano(2,"Pepe");
		System.out.println(p1+" // "+ p1.equals(p2) + " // "+p1.compareTo(p2) + " // " + p1.hashCode());
		System.out.println(p2+" // "+ p2.equals(p1) + " // "+p2.compareTo(p1) + " // " + p2.hashCode());
		System.out.println(p3+" // "+ p3.equals(p1) + " // "+p3.compareTo(p1) + " // " + p3.hashCode());
		
		Perro 	pe1 = new Perro(1,10);
		Perro  	pe2 = new Perro(1,10);
		Perro  	pe3 = new Perro(2,10);
		System.out.println(pe1+" // "+ pe1.equals(pe2) + " // "+pe1.compareTo(pe2) + " // " + pe1.hashCode());
		System.out.println(pe2+" // "+ pe2.equals(pe1) + " // "+pe2.compareTo(pe1) + " // " + pe2.hashCode());
		System.out.println(pe3+" // "+ pe3.equals(pe1) + " // "+pe3.compareTo(pe1) + " // " + pe3.hashCode());
	}
}
