package Colletions;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(432);
		hs.add("DSff");
		hs.add(84683);
		hs.add("1343");
		hs.add("shree");
		Iterator hhs = hs.iterator();
		while(hhs.hasNext())
		{
			System.out.println(hhs.next());
		}
	}
	
	
	
}
