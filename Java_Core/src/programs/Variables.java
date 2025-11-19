package programs;

public class Variables {
	static int var1=10;
	
	 int a=22;
	 void m1()
   {   
//m2();
//		System.out.println(var1+2);
//		System.out.println(a+22);
		//System.out.println(c);
		 Variables v1=new Variables();
		 v1.a=229;
		 System.out.println(v1.a);
	}
	
	 void m3()
	 {
		 int c=220;
		 System.out.println(c);
	 }
	 static void m2()
	 {
		 System.out.println("Bhagyashree");
		 Variables v=new Variables();
		 //v.m1();
		 System.out.println(v.a);
	 }
	public static void main(String[] args) {
		Variables v=new Variables();
		v. m1();
//		v.m2();
//		v.m3();
//		System.out.println(var1);
//		System.out.println(Variables.var1);
	}

}
