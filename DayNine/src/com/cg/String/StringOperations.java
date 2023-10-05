package com.cg.String;

public class StringOperations {

	public static void main(String[] args) {
	
		
		String s1=new String("Indian");
		System.out.println(s1);
		
		String s2=s1.toUpperCase();
		System.out.println(s2);
		
		
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(4,6));
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		
		String s3="Soldier";
		System.out.println(s1.concat(s3));
		
	}

}
