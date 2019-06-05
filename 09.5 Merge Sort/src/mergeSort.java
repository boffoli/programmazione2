import java.util.*;
import java.lang.*;

public class mergeSort {
	static void swap(Object a[],int s,int b){
		 Object temp = a[s];
	     a[s] = a[b];
	     a[b] = temp;
	}
	
	private static void mergeSort (Object src[], Object dest[], int low, int high) {
		int length = high - low;
		if (length < 7) {			// Insertion sort on smallest arrays
		    for (int i=low; i<high; i++)
		    	for (int j=i; j>low &&	((Comparable)dest[j-1]).compareTo((Comparable)dest[j]) >0; j--)
		    		swap(dest, j, j-1);
		    return;
		}
	    
	    int mid = (low + high)/2;		// Recursively sort halves of dest into src
	    mergeSort(dest, src, low, mid);
	    mergeSort(dest, src, mid, high);
	    // If list is already sorted, just copy from src to dest.  This is an
	    // optimization that results in faster sorts for nearly ordered lists.
	    if (((Comparable)src[mid-1]).compareTo((Comparable)src[mid]) <= 0) {
	       System.arraycopy(src, low, dest, low, length);
	       return;
	    }
	    // Merge sorted halves (now in src) into dest
	    for(int i = low, p = low, q = mid; i < high; i++){
	        if (q>=high || p<mid && ((Comparable)src[p]).compareTo(src[q])<=0)
	                dest[i] = src[p++];
	        else
	            dest[i] = src[q++];
	    }
	}

}
