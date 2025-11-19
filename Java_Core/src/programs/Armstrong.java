package programs;

import java.util.Scanner;

public class Armstrong {
	
	public void arm()
	{
		int n=163; int rem; int sum=0; int temp=n;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==temp)
		{
			System.out.println("Given no. is armstrong");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
	
	public void palindrom()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int rem; int rev=0; int temp=n;
		while(n>0)
		{
			 rem=n%10;
			 n=n/10;
			 rev=rev*10+rem;
		}
		if(rev==temp)
		{
			System.out.println("Your Provided number is Palindrom");
		}
		else
		{
			System.out.println("Not a Palindrom Number");
		}
	}
	
	public void even_odd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("ODD NUMBER");
		}
	}
	public void even_odd1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	System.out.println("Even Numbers are:-");
	for(int i=1;i<=n;i++)
	{   
		if(i%2==0)
		{  
			System.out.println(i+" ");
		}
	}
	
		System.out.println();
		System.out.println("Odd Numbers Are");
		
		
		for(int j=1;j<=n;j++)
		{   
			if(j%2!=0)
			{  
				System.out.println(j+" ");
			}
	}
	
	}
public static void main(String[] args) {
	Armstrong ar=new Armstrong();
	//ar.arm();
	//ar.palindrom();
	//ar.even_odd();
	ar.even_odd1();
	
}
}
