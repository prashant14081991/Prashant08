package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class program14_countRepeating_char_inString_usingHashmap
{
	public static void main(String[] args) {
		
	String mdm="acdabcaccbbadd";
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
 
	for (int i = 0; i <= mdm.length()-1; i++)
	{
		char charValue = mdm.charAt(i);
		if (map.containsKey(charValue)) 
		{
			map.put(charValue, map.get(charValue)+1);
		}
		else {
			map.put(charValue, 1);
		}
	}
	
	Set<Character> keys = map.keySet();
	
	for (Character singleKey:keys) 
	{
		System.out.println(singleKey+ ":" + map.get(singleKey));
	}


}
}