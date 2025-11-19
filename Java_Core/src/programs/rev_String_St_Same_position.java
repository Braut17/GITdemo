package programs;

public class rev_String_St_Same_position {
	
	static void m1()
	{
		String s1="jAYSHree Ruat";
	//	int l=s1.length();
		String[] ss = s1.split(" ");
		int l=ss.length;
		for(int i=0;i<l;i++)
		{
			for(int j=ss[i].length()-1;j>=0;j--)
			{
				System.out.print(ss[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	
	}
		
public static void main(String[] args) {
	m1();
//String s="Bhagyashree Dattatraya Raut";
//int l=s.length();
//String[] a=s.split(" ");
//for(int i=0;i<a.length;i++)
//{
//	for(int j=a[i].length()-1;j>=0;j--)
//	{
//		System.out.print(a[i].charAt(j));
//	}
//	System.out.print(" ");
//}
}
}
