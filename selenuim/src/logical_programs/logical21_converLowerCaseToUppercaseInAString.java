package logical_programs;

import org.apache.pdfbox.contentstream.operator.text.SetCharSpacing;

public class logical21_converLowerCaseToUppercaseInAString 
{
public static void main(String[] args) {
	
	String str="abc DEF ghi JKL";
	
	StringBuffer newstr=new StringBuffer(str);
	
	for (int i = 0; i <= str.length()-1; i++) 
	{
		char s1 = str.charAt(i);
		if (Character.isLowerCase(s1))
		{
			newstr.setCharAt(i, Character.toUpperCase(s1));
		}
		else if(Character.isUpperCase(s1)) 
		{
			newstr.setCharAt(i, Character.toLowerCase(s1));
		}
		
	}
	System.out.println("new string:"+newstr);
}
}
