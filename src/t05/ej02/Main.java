package t05.ej02;

public class Main {

	public static void main(String[] args) {
		int nPersonas = Integer.parseInt(args[0]);
		Persona[] personas = new Persona[nPersonas];
/*
		int cont = 1;
		for (int i=0;i<nPersonas;i++) {
			personas[i] = new Persona(Integer.parseInt( args[cont] ) , args[ cont+1 ] , args[ cont+2] );
			cont += 3;
		}
		
		*/
		for (int i=0;i<nPersonas;i++) {
			personas[i] = new Persona(Integer.parseInt( args[ i*3+1 ] ) , args[ i*3+2 ] , args[ i*3+3 ] );
		}
		
		for (int i=0;i<nPersonas;i++) {
			System.out.println(personas[i]);
		}
		

	}

}
