package _pruebas.map;

import java.util.HashMap;
import java.util.Map;

public class Enteros {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		
		m.put( 0,"CERO" );
		m.put( 1,"UNO" );
		m.put( 2,"DOS" );
		m.put( 3,"TRES" );
		m.put( 1000,"MIl" );
		m.put( 1,"OTRO" );
		
		System.out.println(m);
	}

}
