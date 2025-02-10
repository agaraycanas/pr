package _pruebas.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) {
		Stack<Persona> nombres = new Stack<>();
		
		nombres.add(new Persona("UNO"));
		nombres.add(new Persona("DOS"));
		nombres.add(new Persona("TRES"));
		nombres.add(new Persona("CUATRO"));
		nombres.add(new Persona("CINCO"));
		
		System.out.println(nombres);
		while ( ! nombres.isEmpty()) {
			//System.out.println( nombres.poll() );
			System.out.println( nombres.pop() );
		}
	}		

}
