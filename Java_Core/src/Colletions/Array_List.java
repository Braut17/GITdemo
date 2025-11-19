package Colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Array_List {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(0, 12);
		al.add(1, 122);
		al.add(2, 22);
		al.add(3, 22);
//	  System.out.println(al);
//	  System.out.println(al.size());
//	  System.out.println(al.isEmpty());
//	  System.out.println(al.contains(12));
//	  System.out.println(al.get(2));
	  al.add(4, 500);
	//  System.out.println(al);
	  al.remove(1);
	//  System.out.println(al);
	  al.set(0, 234556);
//	  System.out.println(al);
	  java.util.Iterator itr = al.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  
	  ListIterator ltr = al.listIterator();
	  while(ltr.hasNext())
	  {
		  System.out.print(ltr.next()+ " ");
	  }
	  
	  for(int i=0;i<al.size();i++)
	  {
		  System.out.print(al.get(i));
	  }
	  
	  
	  	
	}
}
