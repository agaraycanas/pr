package _pruebas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(-6);
		numeros.add(19);
		numeros.add(-987);
		numeros.add(-19007);
		System.out.println(numeros);
		
		System.out.println(
		numeros.stream()
			.map( a -> -a )
			.map( a -> a+3)
			.map( a -> (a%2!=0)?0:a)
			.filter( a-> a>0)
			.collect(Collectors.toList())
		);
	}

}
