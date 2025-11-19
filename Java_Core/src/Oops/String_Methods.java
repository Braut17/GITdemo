package Oops;

public class String_Methods {
public static void main(String[] args) {
	
	String s="Bhagyashree";
	String s1=new String("Shree");
	
	//For Comparison of Content
	
	System.out.println(s.equals(s1));
	

	//For Adress Comparison
	String s3="Bhagyashree";
	String s4="Bhagyashree";
	String s5=new String("Bhagyashree");
	System.out.println(s3==s4);
	System.out.println(s4==s5);
	
	//Get Values by Index
	String s6="Testing";
	System.out.println(s6.charAt(3));
	
	//Comparison Ignore Cases
	String s7="Engineer";
	String s8="engiNeer";
	System.out.println(s7.equalsIgnoreCase(s8));
	System.out.println(s7.equals(s8));
	
	//Substring
	
	String s9="Bhagyashree";
	System.out.println(s9.substring(6));
	
	//Substring with Start and End Index
	
	String s10="Dnyaneshwari";
	System.out.println(s10.substring(4, 8));
	
	
	//Length Of String
	String s11="Sayali";
	System.out.println(s11.length());
	
	//Replace Character
	String s12="Shree";
	System.out.println(s12.replace('e', 'o'));
	
	//Replace String
	
	String s13="Perfect";
	System.out.println(s13.replace("fe", "Se")); 
	String i="In dia";
	System.out.println(i.replaceAll(" ", ""));
	
	String s14="Katraj";
	System.out.println(s14.replace("raj", "TUTE,Pune"));
	
	
	//Trim Method
	String s15="         Indi  a is my country        ";
	System.out.println(s15.trim());
	System.out.println(s15.trim().replaceFirst("  ", ""));
	
	//INDEX OF
	
	String g="JayaJaya";
	System.out.println(g.indexOf('y'));
	
	//CONTAINS
	String b="Bhagyashree";
	System.out.println(b.contains("shree"));
	System.out.println(b.contains("sht"));
    System.out.println(b.startsWith("B"));
    System.out.println(b.endsWith("e"));
    
    
    //MORE INDEXES(if want all indexes of particular char)
    String r="ddldshfkhkjfff";
    for(int j=0;j<r.length();j++)
    {
    	if(r.charAt(j)=='d')
    	{
    		System.out.println(j);
    	}
    }
    
    //CHAR ARRAY
    String d="india";
    char[] a = d.toCharArray();
    //for(int o=0;o<a.length;o++)
    //{
    //System.out.println(a[o]);
    //}
    //System.out.println(a[1]);
    for(char gg:a)
    {
    	System.out.println(gg);
    	System.out.println(a[2]);
    }
    
    //CONVERTING  PREMITIVE TO STRING
    int m=344;
    String st = String.valueOf(m);
    System.out.println(st+33);
    
    //CONVERT STRING TO PRIMITIVE DATA
    String sd="334";
    //We Need To Use Wrapper Class
    int in = Integer.parseInt(sd);
    System.out.println(in +200);
    
    //
    String ss="33.56";
    double sss = Double.parseDouble(ss);
    System.out.println(sss);
    
    //ASSIGNMENT
    String asn="this is string";
    //char[] dk = asn.toCharArray();
    //System.out.println(dk.length);
    
    String[] ssss = asn.split(" ");
    System.out.println(ssss.length);
    for(int f=2;f>=0;f--)
    {
    	System.out.print(ssss[f]+ " ");
    }
    System.out.println();
    //WANT ONLY NUMBERS
    String x="1gifo47hdgskt"; 
    int l=x.length();
	for(int w=0;w<l;w++)
	{   
		boolean bby = Character.isDigit(x.charAt(w));
		if(bby==false)
			
		{
			System.out.print(x.charAt(w));
		}	    
	}      
}
}


