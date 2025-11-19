package Oops;

public class Casting_2 extends Casting_1 {
	
	void m2()
	{
		System.out.println("Child Class");
	}
	
	
	public static void main(String[] args) {
		
		Casting_2 c2=new Casting_2();
		
		c2.m1();
		c2.m2();
		
		
		
		//c.m2();
	}

}
