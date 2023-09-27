package com.cg.PackageOne;


public class TestOne {
		
		public int id=5;
		 public void display() {
			System.out.println("Access Modifier");
		}

		public static void main(String[] args) {
			TestOne t1=new TestOne();
			System.out.println(t1.id);
			t1.display();	
		}
}
