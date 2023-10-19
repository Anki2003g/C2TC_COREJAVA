package com.cg.listinterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo{

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(2,60);
		ll.add(30);
		System.out.println(ll);
		
		ll.addFirst(200);
		ll.addLast(100);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		LinkedList<Integer>llOne=new LinkedList<>();
		llOne.add(80);
		llOne.add(70);
		llOne.add(90);
		llOne.addAll(2,llOne);
		System.out.println(ll);
		System.out.println(llOne);
		
		/*ListIterator<Integer> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());*/
		
		
		Iterator<Integer> i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(ll);
		System.out.println(ll);
		
		LinkedList<Person> llperson=new LinkedList<>();
		llperson.add(new Person("Anu",20));
		llperson.add(new Person("Tanu",21));
		llperson.add(new Person("Bhnu",22));
		llperson.add(new Person("Shnu",23));
		/*Collections.sort(llperson);
		System.out.println(llperson);*/
		


	}

}
