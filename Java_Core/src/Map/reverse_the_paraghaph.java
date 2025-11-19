package Map;

public class reverse_the_paraghaph {

	public static void main(String[] args) {
		
		//reverse the string at same position
		String str="my name is khan";
		String [] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
		
		
//		String s="my name is guddu";
//		String[] arr = s.split(" ");
//		for(int i=arr.length-1; i>=0;i--)
//		{
//			System.out.println(arr[i] +" ");
//		}
	}
}
