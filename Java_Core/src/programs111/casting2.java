package programs111;

public class casting2 extends casting1 {
	
	public void m1()
	{
		System.out.println("overrriden method");
	}
	public void m2()
	{
		System.out.println("Child method");
	}
	public static void main(String[] args) {
	
	
	 
	casting2 c=new casting2();
	c.m1();
    casting1 cc=new casting2();
    cc.m1();
    casting2 cs=(casting2)cc;
    cs.m2();
    
	}

	}


