package com.cg.statickeyword;

public class StaticMethod {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Ankitha");
		System.out.println(s1);
		System.out.println("--------After modification------");
		
		s1.modify();
		Student.modify();
		System.out.println(s1);
		
		
	}

}
