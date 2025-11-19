package Oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Types {
	
	void m1() throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\raut.xlsx\\");
	    System.out.println("File Found");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Exception_Types m=new Exception_Types();
		m.m1();
		
	}

}
