package programs111;

public class Excp {

	public static void main(String[] args) {
		int a=10; int b=0;
		try
		{
		int c=a/b;
		System.out.println(c);}
		catch(ArithmeticException ar)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Out from Exception");
	
	}
}
