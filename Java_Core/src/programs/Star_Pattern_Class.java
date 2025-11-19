package programs;

public class Star_Pattern_Class {
	
	public void star()
	{	
//		  *
//		 **
	//  ***
	// ****
			int star=1;
			int space=3;
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
				space--;
				star++;
			}
	}
	
	public void star1()
	{
//		*
//		**
//		***
//		****
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}
	
	public void star2()
	{
//****
// ***
//  **
//   *
		int star=4;
		int space=0;
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
			star--;
			space++;
		}
	}
	public void star3()
	{
		//****
		//***
		//**
		//*
		int star =4; 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}
	
	public void star4()
	{
//		*
//	   ***
//	  *****
//	 *******
		int star =1; int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}	 
	}
	public void star5()
	{
//		*******
//		 *****
//		  ***
//		   *
		int star=7; int space=0;
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
			  star=star-2;
			  space++;
		    }
		  	}
			//****
			//***
			//**
			//*
		    //**
		    //***
		    //****
		 public void Star6()
		 {
			 
			 int star=4;
			 for(int i=1;i<=7;i++)
			 {
				 for(int j=1;j<=star;j++)
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
		    //*
		    //**
		    //***
		    //****
		    //***
			//**
			//*
		 public void star7()
		 {
			 int star=1;
			 for(int i=1;i<=7;i++)
			 {
				 for(int j=1;i<=star;j++)
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
//		 *
//		**
//     ***
//    ****
//     ***
//      **
//       *
		 public void star9()
		 {
			int star=1; int space=3;
			
			for(int i=1;i<=7;i++)
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
					star++;
					space--;
				}
				else
				{
					star--;
					space++;
				}
			}
		 }
		 
		
//		*
//	   ***
//	  *****
//	 *******
//	  *****
//	   ***
//	    *
	  public void star10()
	  {
		  int star=1; int space=3;
		  for(int i=1;i<=7;i++)
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
				  star=star+2;
				  space--;
			  }
			  else
			  {
				  star=star-2;
				  space++;
			  }
		  }
				  
	  }
		 
		 
		 
	public static void main(String[] args) {
		Star_Pattern_Class sp=new Star_Pattern_Class();
//		sp.star();
//		sp.star1();
//		sp.star2();
//		sp.star3();
//		sp.star4();
//		sp.star5();
//		sp.Star6();
//		sp.star9();
//		sp.star7();
		sp.star10();


	}

}
