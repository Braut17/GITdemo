package Colletions;

public class Interview_New {
	
	public static void main(String[] args) {
		String s="my name bhagyashree";
		
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				for(int j=arr[i].length()-1;j>=0;j--)
				{
					System.out.print(arr[i].charAt(j));
				}
				System.out.print(" ");
			   }
				else
				{
					System.out.print(arr[i]+ " ");
				}
			}
		}
		
	}


