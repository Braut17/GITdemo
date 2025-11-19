package programs111;

public class stt {
	public static void main(String[] args) {
		String s="my name is bhagya";
		String[] a = s.split(" ");
		int l=a.length-1;
		for(int i=0;i<=l;i++)
		{    
			for(int j=7;j>=3;j--)
			{   //if(i==2)
				System.out.println(a[i].charAt(j));
			}
//		else
//		{
//			System.out.println(a[i].charAt(j));
//		}
		}
		
		
	}

}
