package com.cg.String;

public class StringBuffer {

	public static void main(String[] args) {
		
		String s1=new String("Good");
		s1.concat("morning");
		System.out.println(s1);
		
		StringBuilder sb=new StringBuilder("Study");
		sb.append("night");
		System.out.println(sb);
		

	}

}
