package programs;

import java.util.Scanner;

public class Strng {
	
	//reverse the string 
	 void m1()
	{
	String s="Bhagyashree";
	int l=s.length();
	for(int i=l-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	
	}
	//reverse string using scanner
	void m2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
	//reverse the string at the same position
	
	void m3()
	{
		String s="BHAGYASHREE RAUT";
		String[] a = s.split(" ");
		int l=s.length();
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}			
	}
	//calculate cases in string
	
	void m4()
	{
		String s="Bhafxjadjgjd bgAAKDHJKDH";
		int count=00;
		for(int i=0;i<s.length();i++)
		
			{
				count++;
			}
		
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		Strng d=new Strng();
		//d.m1();
		//d.m2();
		//d.m3();
		d.m4();
		
	}

}
