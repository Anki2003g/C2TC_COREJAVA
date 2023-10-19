package com.cg.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList i=new ArrayList();
		System.out.println(i);
		System.out.println(i.isEmpty());
		System.out.println(i.size());
		i.add(10);
		i.add(true);		
		i.add("hi");
		i.add(10);
		i.add(null);		
		i.add(2,"hello");
		System.out.println(i);

		i.remove(2);
		i.remove(true);
		System.out.println(i);
		
		System.out.println(i.get(3));

	}

}
