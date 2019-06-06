package com.prova.util;
// Sorting an array of Strings.
import com.prova.util.*;
import java.util.*;

public class StringSorting {
	public static void main(String[] args) {
	String[] sa = new String[30];
	Arrays.fill(sa,Arrays2.StringGenerator());
	Arrays2.print("Before sorting: ", sa);
	Arrays.sort(sa);
	Arrays2.print("After sorting: ", sa);
	}
}
