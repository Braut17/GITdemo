package Mock;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Remove_Duplicate_Char {

	
	public static void main(String[] args) {
		String s="pavanpatildaryarprsdsd";
		String[] split = s.split("");
		
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0; i<split.length; i++)
		{
			al.add(split[i]);
		}
		System.out.println(al);
		
		LinkedHashSet<String> tr=new LinkedHashSet<String>(al);
		for(String list:tr)
		{
			System.out.println(list);
		}
	}
}
