package Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class nw {
	public  void words() {

		String s="Bhagyashree--Raut";
	    String a[] = s.split("");
	    ArrayList<String> al=new ArrayList<String>();
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	al.add(a[i]);
	    }

     TreeSet<String> tr=new TreeSet<String>(al);
	 for(String s1:tr)
    {
    	System.out.println(s1+":"+Collections.frequency(al, s1));
    }	   
	}
	
	
	
	
	public static void main(String[] args) {
//  ArrayList<Integer> al=new ArrayList<Integer>();
     List<Integer> l=Arrays.asList(122,264,3685,3665,972947,40,40,40,40);
//      al.add(0, 100);
//      al.add(1, 200);
//      al.add(2, 300);
//      al.add(3, 400);
//      al.add(4, 500);
//      al.add(5, 300);
     TreeSet<Integer> tr=new TreeSet<Integer>(l);
	 for(Integer s1:tr)
    {
    	System.out.println(s1+":"+Collections.frequency(l, s1));
    }	   
	}
}
