package logical_programs;

public class program11_reverseNumber {
	public static void main(String[] args) {
		
	int orgNumb=125486;
	String s1 = Integer.toString(orgNumb);
	
	String rev="";
	
	for (int i = s1.length()-1; i>=0; i--) 
	{
		rev=rev+s1.charAt(i);
	}
	
	int revNum = Integer.parseInt(rev);
	System.out.println(revNum);
}
}