package Oops;

public class Concrete_1 extends Absgtract_1 
{
	public void m1()
	{
		System.out.println("concrete class method-1");
	}
	public void m2()
	{
		System.out.println("concrete class method-2");
	}
public static void main(String[] args) {
	Concrete_1 c=new Concrete_1();
	c.m1();
	c.m2();
	}
}
