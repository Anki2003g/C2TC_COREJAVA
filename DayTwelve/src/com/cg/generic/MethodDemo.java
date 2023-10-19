package com.cg.generic;

public class MethodDemo {
	
	public <E> void displayArrayElements(E[] elements) {
		for(E element:elements)
			System.out.println(element);
			
		
	}
}
