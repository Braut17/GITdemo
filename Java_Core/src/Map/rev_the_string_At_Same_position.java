package Map;

import org.checkerframework.checker.units.qual.s;

public class rev_the_string_At_Same_position {
	
	
	public static void str()
	{
		String b="This is boss";
		String[] a = b.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	public static void str1()
	{
		String ss="gdkgfkg4836432n`21`122@@@@";
		for(int i=0;i<ss.length();i++)
		{
		if(Character.isAlphabetic(ss.charAt(i))==true)
		{
			System.out.print(ss.charAt(i));
		}		
	}
	
	}
	
	
	
public static void main(String[] args) {
	      str1();
	     //str();
	     System.out.println("new");
		String s="my name is guddu";
		String[] arr = s.split(" ");
		for(int i=0; i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		
}
}
