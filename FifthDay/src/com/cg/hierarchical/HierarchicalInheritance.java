package com.cg.hierarchical;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Employee e1=new Employee();
		e1.setEmpId(2003);
		e1.setSalary(25000);
		s1.setRollno(03);
		s1.setStudentname("Deeksh");
		e1.setAge(21);
		e1.setGender("Male");
		s1.setAge(22);
		s1.setGender("Female");
		
		System.out.println("e1" +e1 + "s1" +s1);

	}

}
