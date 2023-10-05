package com.cg.String;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());  //16
		
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb.capacity());   //16+5=21
		
		sb.append("how are you?");
		System.out.println(sb.capacity()); //21

		sb.append("I am fine... Tell me something about Yourself"); //21*2+2=47
		System.out.println(sb.capacity());
		
		
		sb.ensureCapacity(60);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());
		
		
	}

}
