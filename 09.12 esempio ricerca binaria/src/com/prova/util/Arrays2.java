package com.prova.util;
import java.lang.*;
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


	public String StringGenerator() {	  
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();	 
	    return generatedString;
	}
}
