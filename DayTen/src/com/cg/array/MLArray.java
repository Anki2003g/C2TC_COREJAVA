package com.cg.array;

public class MLArray {
	
	public static void printArray(int c[][])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
