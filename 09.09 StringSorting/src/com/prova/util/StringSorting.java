package com.prova.util;
// Sorting an array of Strings.
import com.prova.util.*;
import java.util.*;

public class StringSorting {
	public static void main(String[] args) {
	String[] sa = new String[30];
	Arrays2.fill(sa,new Arrays1.RandStringGenerator(5));
	Arrays2.print("Before sorting: ", sa);
	Arrays2.sort(sa);
	Arrays2.print("After sorting: ", sa);
	}
}
