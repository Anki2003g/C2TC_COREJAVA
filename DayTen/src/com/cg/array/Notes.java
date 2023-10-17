package com.cg.array;

import java.util.Scanner;

public class Notes {
	public static void main(String[] args) {
	//Static
	int arr[]=new int[5];
	int a[]= {10,20,30,40,50,60};
	System.out.println(a[5]);
	
	//Dynamic
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int b[]=new int[size];
	System.out.println(arr[4]);
	System.out.println(b[3]);
	}
}
