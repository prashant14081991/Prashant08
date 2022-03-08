package logical_programs;

public class program10_spaceCountInString 
{
public static void main(String[] args) {
	
	String str="ac  d fr  fd  ";
	int count= 0;
	
	for (int i = 0; i <= str.length()-1; i++)
	{
		char str1=str.charAt(i);
		if (str1==' ') 
		{
			count++;
		}
	}
	System.out.println("number of space : " + count);
}
}
