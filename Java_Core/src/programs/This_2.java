package programs;

public class This_2 {
	
	
	//cannot used with static method//
	int a=20;
	public void m1()
	{
		int a=20;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		This_2 t=new This_2();
		
		t.m1();
		
	}

}
