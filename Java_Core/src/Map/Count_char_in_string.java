package Map;

import java.util.HashMap;
import java.util.Set;

public class Count_char_in_string {
	
	public static void main(String[] args) {
		String c="aakgdkgjsasasksfkhshf";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
       for(int i=0;i<c.length();i++)
       {
    	   char s1 = c.charAt(i);
    	   if(hm.containsKey(s1))
    	   {
    		   hm.put(s1, hm.get(s1)+1);
    	   }
    	   else
    	   {
    		   hm.put(s1, 1);
    	   }
       }
       System.out.println(hm);
	
//	   Set<Character> keys=hm.keySet();
//	   for(Character key:keys)
//	   {
//		   System.out.println(key+":"+hm.get(key));
//	   }
	
	}
}
