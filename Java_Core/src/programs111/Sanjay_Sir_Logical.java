package programs111;

public class Sanjay_Sir_Logical {
	
	//find spaces in string
	public static void string_spaces()
	{
		String str="a bbdj akdd ab";
		int l=str.length()-1;
		int count=0;
		for(int i=0;i<=l;i++)
		{     char s13=str.charAt(i);
		
			if(s13==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static void rev_number()
	{
		int i=65865895;
		String str1 = Integer.toString(i);
		int l=str1.length()-1;
		for(int j=l;j>=0;j--)
		{
			System.out.print(str1.charAt(j));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//string_spaces();
		rev_number();
		
	}

}
