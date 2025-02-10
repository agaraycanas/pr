package _pruebas.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put(new Peque(1), new Grande("A"));
		m.put(new Peque(2), new Grande("B"));
		
		System.out.println(m);
		
		m.put(new Peque(1), new Grande("LOQUESEA"));
		System.out.println(m);
	}

}
