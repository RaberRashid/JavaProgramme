
public class Vektorberechnung {
	public static void main(String[] args) {
		
		int[] v = {2,4,1};
		int[] w = {-3,0,3};
		int ergebnis = skalarProdukt(v,w);
		System.out.print(ergebnis + "\n");
		
		int [][] feld = {{2,4,1},
		                 {3,0,3},
                         {1,3,4}};
		int i = 2;
		int[] zeile = getZeile(feld, i);
		System.out.print(zeile[0] +" "+ zeile[1] +" "+ zeile[2]);
		
		System.out.print("\n");
		
		int j = 0;
		int[] spalte = getSpalte(feld,j);
		System.out.print(spalte[0] +" "+ spalte[1] +" "+ spalte[2]);
		
		
	}
	public static int skalarProdukt(int[] v, int[] w) {
		
		int skalarprodukt = 0;
		for(int i = 0; i < v.length; i++) {
			skalarprodukt = v[i] * w[i] + skalarprodukt;
		}
		return skalarprodukt;
	}
	public static int[] getZeile(int[][] A, int i) {
		
		int[] B = new int[A.length];
		
		for(int j = 0; j<A[i].length; j++) {
			B[j] = A[i][j];
		}
		return B;
	}
	public static int[] getSpalte(int[][] B, int j) {
		
		int[] A = new int[B.length];
		
		for (int i = 0; i<B.length; i++) {
			A[i] = B[i][j];
		}
		return A;
	}

}
