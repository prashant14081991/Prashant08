package logical_programs;

public class logical19_countVowelsAndConsonantInString {
	
public static void main(String[] args) {
	
	String str="If you are good at something never do it for free";
	str=str.toLowerCase();
	
	int vowelsCount=0;
	int consoCount=0;
	
	for (int i = 0; i < str.length()-1; i++) 
	{
		if (str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
		{
			vowelsCount=vowelsCount+1;
		}
		else if (str.charAt(i) >= 'a' && str.charAt(i)<='z'){
			consoCount=consoCount+1;
		}
	}
	System.out.println(vowelsCount);
	System.out.println(consoCount);
}

}
