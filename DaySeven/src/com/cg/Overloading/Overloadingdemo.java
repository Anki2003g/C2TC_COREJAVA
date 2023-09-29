package com.cg.Overloading;

public class Overloadingdemo {

	public static void main(String[] args) {
	
		Point p=new Point();
		Point p2=new Point(3.0f,5.0f,8.0f);
		System.out.println(MethodOverloadin.addition(10,20));
		System.out.println(MethodOverloadin.addition(25.0f,20.0f));
		System.out.println(MethodOverloadin.addition(10.0,20.0));
		
		

	}

}
