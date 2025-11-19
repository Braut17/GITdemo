package Oops;


public class Inheritance_Child extends Inheritance_Super {
	void m4()
	{
		System.out.println("This is Child-Class");
	}
	public void m2()
	{
		System.out.println("Child Inherited");
	}
	void m1()
	{
	super.m1();
	}
	public static void main(String[] args) {
		Inheritance_Child child=new Inheritance_Child();
		child.m1();
		child.m2();
		child.m3();
		child.m4();
		System.out.println(child.a);
	}

}
