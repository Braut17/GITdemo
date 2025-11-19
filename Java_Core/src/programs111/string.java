package programs111;

public class string {
	
	
	public static void strdup()
	{
		String str="Bhagyashree";
		int l=str.length();
		for(int i=0;i<=l;i++)
		{
			for(int j=i+1; j<l;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i));
				}
			}
		}
	}
	
	public static void str1()
	{
		String str="@%a@@##ccent+ur&&&e";
				for(int i=0; i<str.length();i++)
				{
					if(Character.isAlphabetic(str.charAt(i))==true)
					{
						System.out.print(str.charAt(i));
					}
				}
				System.out.println("new");
		
	}	
	
	public static void main(String[] args) {
		
		String s="This is bhagyashree raut";
		String []a=s.split(" ");
		for(int i=0;i<=a.length-1;i++)		
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		}
}


