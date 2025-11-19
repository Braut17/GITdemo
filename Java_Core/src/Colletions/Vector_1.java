package Colletions;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0, "ddd");
		v.add(1, "**");
		v.add(2, "bsjd");
		v.add(3, 500);
		ListIterator ltr = v.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
