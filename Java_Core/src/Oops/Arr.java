package Oops;

public class Arr {
	static void even()
	{
		int a[]= {1,2,4,6,7};
		int l=a.length;
		for(int i=0;i<l;i++)
		{   if(i%2==0)
		{
			System.out.println(a[i]);
		}
		}
		
	}
	
	
	static void odd()
	{
		int a[]= {1,2,4,6,7};
		int l=a.length; int sum=0;
		for(int i=0;i<l;i++)
		{   if(i%2!=0)
		{
			sum=sum+a[i];
			System.out.println(sum);
		}
		}
		
	}
	
	public static void main(String[] args) {
		
		odd();
		//even();
		int a[]= {1,2,4,6,7};
		for(int s:a)
		{  int i=1;
		if(i%2==0)
		{
			System.out.println(s);
			i++;
		}
		
		}
	}
	
}
