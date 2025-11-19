package programs111;

public class constr {
	private constr()
	{
		System.out.println("This is Private Constructor");
	}
	public static void main(String[] args) {
		constr c=new constr();
		constr d=new constr();
		
	}

}
