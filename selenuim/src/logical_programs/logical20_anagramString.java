package logical_programs;

import java.util.Arrays;

public class logical20_anagramString {
	public static void main(String[] args) {
		String str="tean";
		String str1="neati";
		
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		
		if (str.length() != str1.length())
		{
		System.out.println("both the string are not anagram");
		}
		else {
			
			char [] s1 = str.toCharArray();
			char [] s2=str1.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if (Arrays.equals(s1, s2)) 
			{
				System.out.println("given string are anagram");
			}
			else {
				System.out.println("given string are not anagram");
			}
			
		}
	}

}
