package com.cg.abstractclass;

public abstract class Shape {
	
	float area;
	
	abstract float calcArea();
	
	void show()
	{
		System.out.println("Area of Shape:"+area);
	}

}
