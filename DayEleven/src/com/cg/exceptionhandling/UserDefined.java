package com.cg.exceptionhandling;

import java.util.Scanner;
class InvalidBloodDonateException extends RuntimeException{
	public InvalidBloodDonateException(String S) {
		super(S);
	}	
}
public class UserDefined {
	public static void validate(int age,int weight) {
		if(age<18 || weight<55) {
			throw new InvalidBloodDonateException("Not eligible to donate blood");
		}
		else
		{
			System.out.println("You are eligible to donate blood");
		}
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int age=sc.nextInt();
	    int weight=sc.nextInt();
		validate(age,weight);
		
		
		
	}

}
