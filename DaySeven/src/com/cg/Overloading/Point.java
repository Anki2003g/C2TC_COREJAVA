package com.cg.Overloading;

public class Point {
	
	private float x;
	private float y;
	private float z;
	
	
	//Constructor 1
	public Point() {
		super();
	}

	//Constructor 2
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//Constructor 3
	
	public Point(float x) {
		super();
		this.x = x;
	}
	

	
	//Constructor 4
	public Point(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	

}
