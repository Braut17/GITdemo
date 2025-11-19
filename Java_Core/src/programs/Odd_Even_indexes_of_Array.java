package programs;

public class Odd_Even_indexes_of_Array {
	
	public static void main(String[] args) {
		int a[]= {1,3,3,6,7,45};
		int l=a.length; int sum=0;
		//System.out.println(l);
		for(int i=0;i<l;i++)
		{
			if(i%2==0)
			{
			sum=sum+a[i];
			System.out.println(sum);
				
			}			
		}		
	}	
}
