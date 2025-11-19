package programs111;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class remove_Dupl_from_Arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(0, 1);
	al.add(1, 2);
	al.add(2, 2);
	al.add(3, 1);
	al.add(4, 2);
//	System.out.println(al);
//    
//	for(Object s1:al)
//    {
//    	System.out.println(s1);
//    }
    HashSet hs=new HashSet(al);
    System.out.println(hs);
	
}
}
