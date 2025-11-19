package Mock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Programs {
	
	
	//*
	//**
	//***
	//****
	//*****
	
	public void star1()
	{
		int star=1;
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			star++;
		}
	}
	//------------------------------------------------------
	
	//*
   //**
  //***
 //****	
	public void star2()
	{
		int star=1; int space =3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++; space--;
		}
	}
	
	//****
	// ***
	//  **
	//   *
	
			public void star3()
			{
				int star=4; int space=0;
	            for(int i=1;i<=4;i++)
	            {
	            	for(int j=1;j<=space;j++)
	            	{
	            		System.out.print(" ");
	            	}
	            	for(int k=1;k<=star;k++)
	            	{
	            		System.out.print("*");
	            	}
	            	System.out.println();
	            	star--; space++;
	            }	
			}
	
			
			//****
			//***
			//**
			//*
			
			public void star4()
			{
				int star=4;
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=star;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					star --;
				}
			}
			
	public void prime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{int a=0;//5--1&5--
		
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				a++;
			}
		   }
		 if(a==0)
		{
			System.out.println(i);
		}
	
		 }
		}
		
		
	public void pm_Arr()
		{
			int a[]= {1,2,3,5,6,7,23647,386578,5,3};
			int l=a.length;
			for(int i=0;i<l;i++)
			{  int count=0;
				for(int j=2;j<a[i];j++)	
				{
					if(a[i]%j==0)
					{
						count++;///2
						
					}
				}
				if(count==0)
				{
					System.out.println(a[i]+" ");
				}				
		}
  
		}	
	public void arr()
	{
		int a[]= {1,2,7,5,4,3,3,4,1};
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}
	
public void tree()
{
	String s="JAYdgfsjfjfklkHIND";
    String a[] = s.split("");
    ArrayList<String> al=new ArrayList<String>();
    for(String s1:al)
    {
    	System.out.println(s1+":"+Collections.frequency(al, s1));
    }
	
	
}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Programs p=new Programs();
//		p.star1();
//		p.star2();
//		p.star3();
//		p.star4();
//		p.prime();
//		p.pm_Arr();
//		p.arr();		
		p.tree();
		
	}

}
