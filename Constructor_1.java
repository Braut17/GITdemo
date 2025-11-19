package programs;

public class Constructor_1 {
	
	public Constructor_1()
	{
		System.out.println("Constructor is Running");
	}
	
	public Constructor_1(int a)
	{   this();

		System.out.println("Constructos Overloading");
		
	}
	public Constructor_1(int b, int c)
	{
		System.out.println("Constructos Done");
	}
	
	
	
	public static void main(String[] args) {
	//Constructor_1 c=new Constructor_1();
	 Constructor_1 d=new Constructor_1(1);
	//Constructor_1 e=new Constructor_1(1,3);
	 
	 

		
	}

}
