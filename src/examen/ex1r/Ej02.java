package examen.ex1r;

public class Ej02 {
	public static void main(String[] args) {
		boolean ord = true;
		
		int ant = Integer.parseInt(args[0]);
		
		for (int i=1; i<args.length;i++) {
			if (Integer.parseInt(args[i]) < ant) {
				ord = false;
			}
			ant = Integer.parseInt(args[i]);
		}
		
		System.out.println(ord?"ORDENADA":"DESORDENADA");
	}
}
