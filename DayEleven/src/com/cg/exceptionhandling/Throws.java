package com.cg.exceptionhandling;

import java.io.IOException;
public class Throws {
	
public static void validate(int age) throws IOException {
		
		if(age<21 || age>27) {
			
			throw new IOException("Not Eligible");
			
		}
		else {
			System.out.println("Eligible to attend military selection");
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			validate(25);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}	

	}

}


	
