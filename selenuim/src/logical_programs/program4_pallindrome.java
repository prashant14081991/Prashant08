package logical_programs;

public class program4_pallindrome {
	
	public static void main(String[] args) {
		
		String mdm="nitin";
		String pallindrome="";
		
		for (int i = mdm.length()-1; i>=0; i--) {
			
			pallindrome= pallindrome + mdm.charAt(i);
		}
		
		if (mdm.equals(pallindrome)) {
			
			System.out.println("given string is pallindrome");
		}
		else 
		{
			System.out.println("given string is not pallindrome");
		}
	}

}
