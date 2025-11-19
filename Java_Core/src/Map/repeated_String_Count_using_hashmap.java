package Map;

import java.util.HashMap;
import java.util.Set;

public class repeated_String_Count_using_hashmap {
	
	
	
	public static void main(String[] args) {
		String s="this is bhagyashree, bhagyashree is beautiful. bhagyashree is talented.";
		String[] a = s.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(int i=0;i<a.length;i++)
			
		{
			String st = a[i];
			if(hm.containsKey(st))
			{
				hm.put(st, hm.get(st)+1);
			}
			else
			{
				hm.put(st, 1);
			}
		} 
		Set<String> keys=hm.keySet();
		for( String key:keys)
		{  if(key.equals("bhagyashree"))
			System.out.println(key+":"+ hm.get(key));
		}		
		
	}

}
