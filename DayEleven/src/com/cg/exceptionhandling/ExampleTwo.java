package com.cg.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleTwo {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\ankit\\OneDrive\\Documents");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k;
		try {
			while((k=fis.read())!=-1)
			{
				
				System.out.println((char)k);
			}

		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try
		{
			fis.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
         

	}

}
