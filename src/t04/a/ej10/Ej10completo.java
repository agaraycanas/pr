package t04.a.ej10;

import java.util.Random;

public class Ej10completo {

	public static void main(String[] args) {
		Random random = new Random();
		int aleatorio;
		int nTiradas = 1000000;
		int nCaras = 3; 
		//int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
		int[] frecuencia = new int[nCaras]; 
		
		for (int i = 0; i < nTiradas ; i++) {
			aleatorio = random.nextInt(nCaras);
			frecuencia[aleatorio]++;
			System.out.println("("+(i+1)+") Número aleatorio entre (1..6): " + aleatorio+1);
		}
		
		System.out.println("===============================");
		System.out.println("Número de caras: "+nCaras);
		System.out.println("Número de tiradas: "+nTiradas);
		System.out.println("El porcentaje t04.a tender debería ser:" + (100.0f/nCaras) + "%");
		
		for (int i=0;i<nCaras;i++) {
			System.out.println("Cara "+(i+1)+": "+frecuencia[i]+"/"+ nTiradas+" veces"+ "[" + ((100f*frecuencia[i])/nTiradas) + "%]" );
		}
	}

}
