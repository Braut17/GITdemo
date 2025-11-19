package programs;

public class Use_of_Constructor {
	
	int roll;
	String name;
	static String SchoolName="ABC SCHOOL";
	
	public Use_of_Constructor(int a, String nameofstudent )
	{
		roll=a;;
		name=nameofstudent;
		
	}	
	
	public static void main(String[] args) {
		Use_of_Constructor c=new Use_of_Constructor(1,"bhagayshree");
		Use_of_Constructor d=new Use_of_Constructor(2,"jayashree");
		Use_of_Constructor e=new Use_of_Constructor(3,"nanu");
		System.out.println(c.roll);
		
	}
	
	
	
	
	

}
