package com.cg.exceptionhandling;

public class ExampleOne {

	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth Element Successfully Displayed");
	}
	public static void main(String[] args) {
		System.out.println("First Element");
		System.out.println("Second Element");
		int[] myIntArray=new int[] {1,2,3};
		try {
			print(myIntArray);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Third element");
		
	}

}
