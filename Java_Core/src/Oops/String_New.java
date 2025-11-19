package Oops;

public class String_New {
	
public static void main(String[] args) {
	
	String s="Bhagyashree";
	String s1=new String("Shree");
	System.out.println("Without New Keywoard:-" + s);
	
	System.out.println("With New Keywoard:-" + s1);
	
	//s.contains(s1);
	System.out.println(s.concat(s1));
	System.out.println(s);
	
	//STRING BUFFER
	StringBuffer sb=new StringBuffer("GUDDI");
	StringBuffer sb1=new StringBuffer("RAUT");
	System.out.println(sb.append(sb1));
	System.out.println(sb);
	
	//STRING BUILDER
	StringBuffer sbl=new StringBuffer("GUDDI");
	StringBuffer sbl1=new StringBuffer("RAUT");
	System.out.println(sb.append(sb1));
	System.out.println(sb);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
