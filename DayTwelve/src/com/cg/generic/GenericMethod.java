package com.cg.generic;

public class GenericMethod {
	
	public static void main(String[] args) {
		
		Integer[] intarray= {10,20,30,40};
		String[] stringarray= {"hello","welcome","to","the","session"};
		Person p1[]=new Person[]{new Person("neha",20),new Person("Anu",20)} ;
		MethodDemo md=new MethodDemo();
		md.displayArrayElements(intarray);		
		md.displayArrayElements(stringarray);		
		md.displayArrayElements(p1);		
	}
}
