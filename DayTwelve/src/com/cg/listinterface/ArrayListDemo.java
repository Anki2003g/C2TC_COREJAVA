package com.cg.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List i=new ArrayList();
		System.out.println(i);
		System.out.println(i.isEmpty());
		System.out.println(i.size());
		i.add(10);
		//i.add(true);		
		//i.add("hi");
		i.add(30);
		i.add(40);
		//i.add(null);		
		i.add(2,50);
		System.out.println(i);
		
		Collections.sort(i);
		System.out.println(i);
		

		/*i.remove(2);
		i.remove(true);
		System.out.println(i);*/
		
		

	}

}
