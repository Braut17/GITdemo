package programs111;

public class strtr {
	public static void main(String[] args) {
		String s="my name is bhagyashree";
		String[] arr = s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{ 
			for(int j=arr[i].length()-1;j>=0;j--)
			System.out.print(arr[2].charAt(j));
		}
	}

}
