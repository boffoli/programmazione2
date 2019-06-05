package com.prova.util;

import java.util.Arrays;

public class ComparatorTest {
	public static void main(String[] args) {
		CompType[] a = new CompType[10];
		Arrays2.fill(a, CompType.generator());
		Arrays2.print("before sorting, a = ", a);
		Arrays.sort(a, new CompTypeComparator());
		Arrays2.print("after sorting, a = ", a);
	}
} 