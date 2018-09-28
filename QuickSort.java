import java.util.Arrays;
public class QuickSort implements SortingAlgorithm {

	public void sort(int [] a) {
		int lower = 0;
		int upper = a.length-1;
		quickSort(a, lower, upper);
	}

	public void swap(int [] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public int partition(int [] a, int lower, int upper) {
		/* Set pivot to be first val */
		int pivot = lower;
		/* Begin after pivot until end of array */
		int start = lower+1;
		int end = upper;

		/* Check that index of lower is less than index of upper */
		while(start <= end) {
			/* If val at start is greater than val at end, swap the two */
			if(a[start] >= a[end]) {
				swap(a, start, end);
			}
			/* Move up while val at start is less than val at pivot */
			while(a[start] < a[pivot]) {
				start++;
			}
			/* Move down while val at end is greater than val at pivot */
			while(a[end] > a[pivot]) {
				end--;
			}
			/* Check if left side < right side, swap if needed */
			if(start <= end) {
				swap(a, start, end);
				start++;
				end--;
			}
		}
		/* Pivot in place where upper left off = left side now less than pivot, right side greater than pivot */
		swap(a, end, pivot);
		/* Return pivot position to partition array */
		return end;
	} /* Close partition */

	public void quickSort(int [] a, int lower, int upper) {
		int pivot = partition(a, lower, upper);
		if(lower < pivot-1) {
			quickSort(a, lower, pivot-1);
		}
		if(pivot+1 < upper) {
			quickSort(a, pivot+1, upper);
		}
	} /* Close quickSort */
}