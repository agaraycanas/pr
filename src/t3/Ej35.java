package t3;

public class Ej35 {
	public static void main(String[] args) {
		int tam = Integer.parseInt(args[0]);
		int dato = Integer.parseInt(args[1]);
		int[] a = new int[tam];
		//TESTO
		for (int i=0;i<tam;i++) {
			a[i] = dato;
		}
		//System.out.println(Arrays.toString(t4.a));
		for (int i=0;i<tam;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
