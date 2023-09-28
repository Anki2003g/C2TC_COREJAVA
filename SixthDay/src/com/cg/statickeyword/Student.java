package com.cg.statickeyword;

public class Student {
	
	private int id;
	private String name;
	private static String college="AVK";
	
	static {
		System.out.println("I am a Static block");
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//Non Static Method
	public static void modify() {
		
		college="Arakalagudu varadarajulu Kanthamma college";
		System.out.println("I am a Modify Method");
	}

@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}


public static void main(String[] args) {
	System.out.println("I am a Main Method");
	modify();
	}
	
}
