package programs111;

public class c1 {
	int a=10; 
	
	
	c1()
	{
		System.out.println("Constructor");
		int  a=20;
	}
	public static void m1()
	{
		System.out.println("super class");
	}
	public int m1(int a)
	{
    System.out.println(10+20);
	return a;	
		
	}
//	public static void main(String[] args) {
//		c1 c=new c1();
//		c.m1(2);
//        c.m1();
//}
}