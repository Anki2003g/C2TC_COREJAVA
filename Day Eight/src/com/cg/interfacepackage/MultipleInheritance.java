package com.cg.interfacepackage;

interface Dad{

	void snoring(); 
}

interface Mom{

	void snoring();
}

class You implements Dad,Mom{
	
	public void snoring() {
		System.out.println("My parents have habit of snoring");
	}
	
	
}

public class MultipleInheritance{
	
	public static void main(String[] args) {
		You y= new You();
		y.snoring();
	}
	
}

