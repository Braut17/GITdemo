package Colletions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_1 {
	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(0, "dfgd");
		ll.add(0, 35254);
		ll.add(0, "shree");
		ll.add(0, 256);
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ll.add(itr);
		ll.set(0, "3214245");
		//System.out.println(ll);
		for(Object ij:ll)
		{
			System.out.println(ij);
		}
	}

}
