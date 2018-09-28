public class InsertionSort implements SortingAlgorithm {

	public void sort(int [] a) {
		insertionSort(a);
	}

	public void insertionSort(int [] a) {
		/* Iterate through array */
		for(int i = 0; i < a.length; i++) {
			/* Store current val in temp to compare, move if needed */
			int temp = a[i];
			int prev = i-1;
			/* While in bounds and if previous val is greater than current val */
			while(prev >= 0 && a[prev] > temp) {
				/* Move smaller val (prev) up */
				a[prev+1] = a[prev];
				/* Keep checking until prev = 0 */
				prev = prev-1;
			}
			/* Move temp up = greater val */
			a[prev+1] = temp;
		}
	} /* Close insertionSort */ 
}