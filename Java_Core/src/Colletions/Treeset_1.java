package Colletions;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_1 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(23444);
	ts.add(1324);
	ts.add(3656400);
	ts.add(24324);
	Iterator tts = ts.iterator();
	while(tts.hasNext())
	{
		System.out.println(tts.next());
	}
	
}
}
