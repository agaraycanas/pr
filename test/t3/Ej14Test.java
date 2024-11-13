package t3;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Ej14Test {

	private int[][] a22 = { {1,2}, {3,4} };
	private int[][] b22 = { {5,6}, {7,8} };
	private int[][] z22 = { {0,0}, {0,0} };
	private int[][] i22 = { {1,0}, {0,1} };

	private int[][] a33 = { {1,2,3}, {4,5,6}, {7,8,9} };
	private int[][] b33 = { {9,8,7}, {6,5,4}, {3,2,1} };
	private int[][] z33 = { {0,0,0}, {0,0,0}, {0,0,0} };
	private int[][] i33 = { {1,0,0}, {0,1,0}, {0,0,1} };

	@Test
	public void A22porCeroEsCero() {
		assertArrayEquals(Ej14.mult(a22, z22), z22);
	}

	@Test
	public void A22porIdEsA() {
		assertArrayEquals(Ej14.mult(a22, i22), a22);
	}

	@Test
	public void A22porB22() {
		int[][] solucion = { {1,2,3}, {4,5,6},{7,8,9}};
		assertArrayEquals(Ej14.mult(a22, b22), solucion);
	}


}
