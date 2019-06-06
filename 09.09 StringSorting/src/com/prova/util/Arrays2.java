package com.prova.util;
import java.lang.*;
import java.nio.charset.Charset;
import java.util.*;

public class Arrays2 {
	public static void print(String str, int[] value) {
	for(int i=0;i<value.length;i++)
		System.out.println(value[i]);
	}
	public static void print(String str, Integer[] value) {
	for(int i=0;i<value.length;i++)
		System.out.println(value[i]);
	}
	public static void print(String str, String[] value) {
		for(int i=0;i<value.length;i++)
			System.out.println(value[i]);
	}

	public static String StringGenerator() {	  
		    byte[] array = new byte[7]; // length is bounded by 7
		    new Random().nextBytes(array);
		    String generatedString = new String(array, Charset.forName("UTF-8"));		 
		    return generatedString;
		}
}
