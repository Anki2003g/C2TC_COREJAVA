package com.cg.generic;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj= new ArrayList<Integer>();
		
		GenericDemo<Integer> gc=new GenericDemo<Integer>();	
		gc.data=10;
		
		
		GenericDemo<Float> gc1=new GenericDemo<Float>();	
		gc1.data=10.0f;
		
		
		GenericDemo<String> gc2=new GenericDemo<String>();	
		gc2.data="Hello";
		
	}

}
