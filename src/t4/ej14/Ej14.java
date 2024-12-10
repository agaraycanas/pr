package t4.ej14;

public class Ej14 {

	public static void main(String[] args) {
		int nTiradas = Integer.parseInt(args[0]);
		int nCaras = Integer.parseInt(args[1]);
		int[] frecuencia = new int[nCaras];

		for (int i=0;i<nTiradas;i++) {
			 int aleatorio = (int)(Math.random() *  nCaras) +1;
			 frecuencia[aleatorio-1]++;
		}
		
		System.out.println("(Tiradas/Caras): " + "("+ nTiradas +"/"+ nCaras +")");
		System.out.println("Porcentaje al que tender: "+ (100f/nCaras) +" %");
		
		for (int i=0;i<nCaras;i++) {
			System.out.println("% "+(i+1)+ " "+ (frecuencia[i]*100f)/nTiradas );
		}
		System.out.println("=================================");
	}
}
