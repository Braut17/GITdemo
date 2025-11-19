package programs111;

public class Exception_1 {
	
	
	public static void main(String[] args) {
		int a =10; int b=0;
		try
		{
		System.out.println(a/b);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Exception");
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Arithmatic Exception");
		}
		System.out.println("EXCEPTION HANDLED");
	}

}
