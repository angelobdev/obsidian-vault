package debugging;

public class Esempio {
	public static void main (String []args) {
		int[] a = {1,2,3,4,5};
		int[] inverso = inversoArray(a);
		for(int i=0; i<inverso.length; i++) 
			System.out.println(inverso[i] + " ");
		boolean crescente = sequenzaCrescente(a);
		System.out.println("\n" + crescente);
	}
	
	public static boolean sequenzaCrescente(int[] a) {
		boolean ris = false;
		for(int i=1; i<a.length; i++) {
			if(a[i] > a[i-1])
				ris = true;
			else
				ris = false;
		}
		return ris;
	}
	
	public static int[] inversoArray(int[] c) {
		int[] nuovoArray = new int[c.length];
 		int j= c.length-1;
		for(int i = 0; i<c.length; i++, j--) 
			nuovoArray[i] = c[j];
		return nuovoArray;
	}
}
