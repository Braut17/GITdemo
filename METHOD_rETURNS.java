package programs;

public class METHOD_rETURNS {
	public boolean m1()
	{
		System.out.println("Return Type is Boolean");
		return false;
	}
	 public int m2(int a)
	 {
		 System.out.println("Int Type Return");
		 int s=10; int b=20; int c;
		 c=s+b;
		 return c;
	 }
	
	
	public static void main(String[] args) {
		METHOD_rETURNS mt= new METHOD_rETURNS();
		boolean mm = mt.m1();
		System.out.println(mm);
		System.out.println() ;
		int rt = mt.m2(11);
		System.out.println(rt);
		System.out.println(mt.m2(22));
		
	}

}
