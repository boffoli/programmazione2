public class sort {
	
	private static void mergeSort(Object src[], Object dest[], int low, int high) {
		int length = high - low;
		// Bubblesort on smallest arrays
		if (length < 7) {
			for (int i=low; i<high; i++)
				for (int j=i; j>low && (dest[j-1] > dest[j]); j--)
					swap(dest, j, j-1);
			return;
		}
	//Parte invariante
	public static void sort(Object[] a){
		Object aux[] = (Object[])a.clone();
		mergeSort(aux, a, 0, a.length);
			
	// Recursively sort halves of dest into src
	int mid = (low + high)/2;
	mergeSort(dest, src, low, mid);
	mergeSort(dest, src, mid, high);
	// If list is already sorted, just copy from src to
	// dest. This is an optimization.
	if ((src[mid-1] <= src[mid]) {
		System.arraycopy(src, low, dest, low, length);
		return;
	}
	// Merge sorted halves (now in src) into dest
	for(int i = low, p = low, q = mid; i < high; i++){
		if (q>=high || p<mid && (src[p] <= src[q]) 
			dest[i] = src[p++];
		else 
			dest[i] = src[q++];
		}
	}

	}
}
