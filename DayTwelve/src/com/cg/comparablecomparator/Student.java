package com.cg.comparablecomparator;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String name;
	private float cgpa;
	
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, float cgpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return (int) (this.rollno-o.rollno);
		
		//for string return this.name.compareTo(o.name);
	}
	
	
	

}
