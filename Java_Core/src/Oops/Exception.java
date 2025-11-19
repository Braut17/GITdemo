package Oops;

import java.util.Scanner;

public class Exception {
	
	void m3()
	{
		int a[]= {13,4,5,6,7};
		try
		{
		System.out.println(a[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
        System.out.println("Array is not Valid");
		}
	}
	
	
	
	
	void m2()
	{
		String s="Shree";
		String d=null;
		
		try
		{
		if(s.endsWith(d))
		{
			System.out.println("Strings are Equal");
		}
		}
		catch (NullPointerException e)
		{
        System.out.println("Strings are not equals");		}
	}
	
	
	
	void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1");
		int s=sc.nextInt();
		System.out.println("Enter num2");
		int d=sc.nextInt();
		//int h=sc.nextInt();	
		int h=0;
	
	try {
		
		System.out.println(h=s/d);
	}
	catch(ArithmeticException w)
	{
		
		System.out.println("Excp Handled");
		d=10;
	}
	
	
	}
	
public static void main(String[] args) {
	Exception b=new Exception();
     b.m3();
	// b.m2();
	//b.m1();
	
//	int i=10; int j=0;int a=0;
//	
//	try {
//		System.out.println(a=i/j);
//		} 
//	   
//	catch (ArithmeticException e) 
//	{
//		System.out.println("Handled");
//		a=2;
//	}
//	System.out.println("Exception is Handled");
}
}
