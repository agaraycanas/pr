package _pruebas.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map< Peque, Grande > m = new TreeMap<>();
		
		m.put(new Peque(1000), new Grande(">>"));
		m.put(new Peque(3), new Grande("C"));
		m.put(new Peque(1), new Grande("A"));
		m.put(new Peque(2), new Grande("B"));
		m.put(new Peque(4), new Grande("H"));
		
		System.out.println(m);
		
		
		m.put(new Peque(1), new Grande("LOQUESEA"));
		System.out.println(m);
		
	}

}
