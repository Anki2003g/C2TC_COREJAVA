package com.cg.statickeyword;


class Outer{
	static int data=10;
	
	static class Inner{
		void msg() {
			System.out.println(data);
		}
	}
}

public class StaticClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.data=20;
		//o.msg();
		Outer.Inner i=new Outer.Inner();
		i.msg();
		Outer.Inner i2=new Outer.Inner();
		i2.msg();
		




	}

}
