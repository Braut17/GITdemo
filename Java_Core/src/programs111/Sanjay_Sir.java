package programs111;

public class Sanjay_Sir {
	
	
	
	//odd index
	
	public static void odd()
	{
		int a[]={1,4,4,5,423};
		 int l=a.length-1;
		  for(int i=0;i<=l;i++)
		{
		 if(i%2==0)  ///0/2=
		
		System.out.println(a[i]);
		}
	}
	
	public static void star()

	{
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			star++;
		
		}
	}
		
		public static void s1()
		{
			int star=1; int space=4;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=space;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=star;k++)
				{
					System.out.print("*");
				}
				System.out.println();star++;
				space--;
			}
		}
		
		
	public static void s12()
	{
		int star=4; int space=0;
		for(int i=1;i<=5;i++)
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
		public static void st()
		{
		int star=4; 
	
	    for(int i=1;i<=6;i++)
	    {
	    	for(int j=1;j<=star;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	star--;
	    }
	
		}
	public static void ss()
	{
		int star=1; int space=4;
		for(int i=1;i<=5;i++)
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
			space--;
			star=star+2;
		}
		
	}
		public static void s()
		{
			int star=7; int space=0;
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=space;j++)
				{System.out.print(" ");}
				for(int k=1;k<=star;k++)
				{
					System.out.print("*");
				}
				System.out.println();
				star=star-2;space++;
				}			
		}
		public static void sss()
		{
			int star=1; int space=3;
			for(int i=1;i<=7;i++)
			{
				for(int j=1;j<=space;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=star;k++) {
					System.out.print("*");
				}
				System.out.println();
				if(i<4)
				{
					star=star+2;space--;
				}
				else
				{
					star=star-2;space++;
				}
			}
		}
		
	public static void sd()
	{
		int star=1; int space=3;
		for(int i=1; i<=7;i++)
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
			if(i<4)
			{
				star++;space--;
			}
			else
			{
				star--;space++;
			}
		}
	}
	public static void ssss()
	{
		int star=1; 
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}
	
	public static void star12()
	{
		int star=4; 
		for(int i=1;i<=7;i++)
		{
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print(" ");
//			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		star12();
		//ssss();
		//sd();
		//sss();
		//s();
		//ss();
		//st();
		//s12();
		//s1();
		//star();
		//odd();
//		int a[]= {1,3,5,59645,864};
//		int l=a.length-1;
//		for(int i=l;i>=0;i--)
//		{
//			System.out.print(a[i]+" ");
//		}
	}

}
