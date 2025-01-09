package t4.c.ej01;

public class Main {
	public static void main(String[] args) {
		int cont = 1;
		for (char c=32; c <= 126 ; c++) {
				System.out.print("("+(int)c+")"+c+"\t");
				if (cont == 6 ) {
					System.out.println();
					cont = 0;
				}
				cont++;
		}
	}
}
