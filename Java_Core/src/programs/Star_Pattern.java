package programs;

import java.util.Arrays;

public class Star_Pattern {
	
	void s1()
	{
		for(int i=0;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void s2()
	{
		for(int i=0; i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void s3()
	{
		for(int i=0; i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void m4()
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=2;j<=i;j++)
			{System.out.print(" ");}
			for(int k=7;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void s5()
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void s6()
	{
		for(int i=0;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=7;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	void m2()
	{
		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				if(i==7 || j==0 ||i==j)
				
			
				System.out.print("*");
				else
                System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	void m3()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{   if(j==1||i==1||i==6||j==6)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	  
	void prime()
	{
		int n=50; 
		for(int i=1;i<=n;i++)
		{  int count=0;
			for(int j=2;j<i;j++)
			
				if(i%j==0)
				{
					count++;
				}
			
		    
			if(count==0)
			{
				System.out.println(i+" ");
			}
		}
	}
	
	void Prime_Array()
	{
		int a[]={2,4,7,6,5,4,4,2,1,3,17,23};
		for(int i=0;i<a.length;i++)
		{   int count=0;
			for(int j=2;j<a[i];j++)
				if(a[i]%j==0)
			{
				count++;
			}
			if(count==0)
			{
				System.out.println(a[i]+" ");
			}
		}
		
	}
	
	void arr()
	{
		int a[]= {4,6,7685,8658,5467,66};
	 Arrays.sort(a);
	 for(int i=a.length-1;i>=0;i--)
	 {
		 System.out.println(a[i]);
	 }
	}
	
	void arm()
	{
		int n=133; int sum=0; int temp=n; int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(sum==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
	 void palindrom()
	 {
		 int a=1215621; int r;int rev=0; int temp=a;
		 while(a>0)
		 {
			 r=a%10;
			 a=a/10;
			 rev=rev*10+r;
		 }
		 if(rev==temp)
		 {
			 System.out.println("palindrom");
		 }
		 else
		 {
			 System.out.println("Not Palindrom");
		 }
	 }
	
	 void fib()
	 {
		int a=1; int b=2; int c=0;
		
	    for(int i=1;i<=5;i++)
	    {
	    	c=a+b;
	    	System.out.println(c);
	    	a=b;
	    	b=c;
	    }
	    
	 }
	 void fact()
	 {
		 int fact=1; 
		 for(int i=1;i<=5;i++)
		 {
			 fact=fact*i;
		 }
		 System.out.println(fact);
	 }
	 
	 void arr_duplicate()
	 {
		 int a[]= {2,3,4,3,2,4,2};
		 int l=a.length;
		 for(int i=0;i<l;i++)
		 {
			 for(int j=i+1;j<l;j++)
			 
				 if(a[i]==a[j])
				 {
					 System.out.println(a[i]);
				 }
				 
			 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	public static void main(String[] args) {
		Star_Pattern d=new Star_Pattern();
		//d.s1();
		//d.s2();
		//d.s3();
		//d.m4();
		//d.s5();
		//d.s6();
		//d.m2();
		//d.m3();
		//d.prime();
		//d.Prime_Array();
		//d.arr();
		//d.arm();
		//d.palindrom();
		//d.fib();
		//d.fact();
		d.arr_duplicate();
	}

}
