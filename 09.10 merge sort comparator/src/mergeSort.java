import java.util.*;
import java.lang.*;
public class mergeSort {
	private static void mergeSort(Object src[], Object dest[],int low, int high, Comparator c) {
		int length = high - low;
		// Insertion sort on smallest arrays
		if (length < 7) {
		    for (int i=low; i<high; i++)
			for (int j=i; j>low && c.compare(dest[j-1], dest[j])>0; j--)
			    swap(dest, j, j-1);
		    return;
		}
	    // Recursively sort halves of dest into src
	    int mid = (low + high)/2;
	    mergeSort(dest, src, low, mid, c);
	    mergeSort(dest, src, mid, high, c);
	
	    // If list is already sorted, just copy 
	    // from src to dest.  
	    if (c.compare(src[mid-1], src[mid]) <= 0) {
	        System.arraycopy(src, low, dest, low, length);
	        return;
	    }
	    // Merge sorted halves (now in src) into dest
	    for(int i = low, p = low, q = mid; i < high; i++) {
	        if (q>=high || p<mid && c.compare(src[p], src[q]) <= 0)
	            dest[i] = src[p++];
	        else
	            dest[i] = src[q++];
	    }
	}
}
