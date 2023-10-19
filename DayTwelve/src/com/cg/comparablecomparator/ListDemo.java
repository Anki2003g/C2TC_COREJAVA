package com.cg.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		/*List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(16,"Pooja",7.8f));
		studentList.add(new Student(02,"Poorni",8.8f));
		studentList.add(new Student(33,"Manju",7.5f));
		studentList.add(new Student(25,"Theja",7.9f));
		System.out.println("----Before sorting");
		System.out.println(studentList);
		
		Collections.sort(studentList);
		
		System.out.println("----After sorting");
		System.out.println(studentList);*/
		
		List<Person> personList=new ArrayList<>();
		personList.add(new Person("Pooja","Bangalore"));
		personList.add(new Person("Poorni","Mangalore"));
		personList.add(new Person("Manju","mumbai"));
		personList.add(new Person("Theja","Bangalore"));
		System.out.println("----Before sorting");
		System.out.println(personList);
		
		
        Collections.sort(personList,new SortByName());
		
		System.out.println("----After sorting");
		System.out.println(personList);
		

	}

}
