// Uso di Arrays.binarySearch().

import com.prova.util.*;
import java.util.*;

public class ArraySearching {
	public static void main(String[] args) {
		int[] a = new int[100];
		Arrays2.RandIntGenerator gen = new Arrays1.RandIntGenerator(1000);
		Arrays2.fill(a, gen);
		Arrays2.sort(a);
		Arrays2.print("Sorted array: ", a);
		while(true) {
			int r = gen.next();
		int location = Arrays2.binarySearch(a, r);
		if(location >= 0) {
			System.out.println("Location of " + r +" is " + location + ", a[" + location + "] = " + a[location]);
			break; // Out of while loop
			}
		}
	}
}