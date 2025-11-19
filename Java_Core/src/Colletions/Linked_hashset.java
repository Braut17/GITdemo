package Colletions;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hashset {
	
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(4537);
		lhs.add("shree");
		lhs.add(null);
		lhs.add(675);
		lhs.add(null);
		lhs.add("rfgds");
		lhs.add(675);
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(lhs.size());		
	}

}
