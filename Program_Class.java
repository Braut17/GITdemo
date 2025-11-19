package programs;

public class Program_Class {
	
	
	
	public static void spacecounter()
	{
		String s="a v bo f   f";
		int  counter=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				counter++;
			}
			
		}
		System.out.println("no. of spaces in string"+ counter++);
	}
	
	public static void main(String[] args) {
		spacecounter();
	}

}
