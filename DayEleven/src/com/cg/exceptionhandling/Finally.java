package com.cg.exceptionhandling;

public class Finally {

	public static void main(String[] args) {
		
		try {
			int data=30/2;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("in final block");
		}
	}
	

}
