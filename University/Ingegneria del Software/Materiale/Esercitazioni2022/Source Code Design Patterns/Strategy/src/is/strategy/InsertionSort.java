package is.strategy;
import java.util.*;

public class InsertionSort implements SortingStrategy{
	//Concrete Strategy
	
	public void sort(int[] v) {
	   for (int index = 1; index < v.length; index++) {
	      int temp = v[index];
	      int j;
	      for (j = index - 1; (j >= 0) && (v[j] > temp); j--) {
	         v[j + 1] = v[j];
	      }
	      v[j + 1] = temp;
	   }
	System.out.println(Arrays.toString(v));
	}

}
