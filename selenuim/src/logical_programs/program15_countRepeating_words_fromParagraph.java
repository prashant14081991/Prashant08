package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class program15_countRepeating_words_fromParagraph {
	
	public static void main(String[] args) {
		
		String mdm="munna sachin munna munna sachin ravi sarita ravi sarita";
		String ar[]=mdm.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for (int i = 0; i <= ar.length-1; i++) 
		{
			String str = ar[i];
			
			if (map.containsKey(str)) 
			{
				map.put(str, map.get(str)+1);
				
			}
			else {
				map.put(str, 1);
			}
		}
		Set<String> keys = map.keySet();
		
		for (String singlekey:keys) 
		{
			System.out.println(singlekey +" "+ map.get(singlekey));
		}
		
	}

}
