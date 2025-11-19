package programs;

public class Countupper_lowercase_char_of_string {
	public static void main(String[] args) {
		
		String s="BHAGYASHREE raut";
		int count=0;
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{count++;}
			
			
		}
		System.out.println(count++);
	}
	
}
