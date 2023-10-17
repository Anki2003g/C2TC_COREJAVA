package com.cg.array;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		int intArr[]= {10,20,15,22,35,18,14};
		System.out.println(intArr[3]);
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
	
		int key=22;
		System.out.println(Arrays.binarySearch(intArr, key));
		
		
		int intArr1[]= {10,20,15,22};
		System.out.println(Arrays.equals(intArr, intArr1));
		
		int intArr2[]=Arrays.copyOf(intArr1, 10);
		System.out.println(Arrays.toString(intArr2));
		
		Arrays.fill(intArr2, 22);
		System.out.println(Arrays.toString(intArr2));
	}

}
