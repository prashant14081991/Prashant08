package logical_programs;

public class program8_armstrong_number {
	
	public static void main(String[] args) {
		
		int Orgnum=153;
		
		int sum=0;
		
		for (int i = Orgnum; i > 0; i=i/10) 
		{
			int rem= i % 10;
			
			sum= sum + (rem * rem *rem );
		}
		
		if (Orgnum==sum ) 
		{
			System.out.println("goven number  " +Orgnum+ " is armstrong number");
		}
		else {
			
			System.out.println("goven number "+ Orgnum  + " is not armstrong number");
			
		}
	}

}
