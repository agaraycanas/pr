package _pruebas.streams;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> original = List.of(1,100,-2,10,2,3,2,1);
		System.out.println(original);
		System.out.println(
		original.stream()
			.mapToInt(Integer::intValue)
			.average()
			.getAsDouble()
		);
			
	}
}
