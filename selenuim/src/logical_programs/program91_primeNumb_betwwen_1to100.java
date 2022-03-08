package logical_programs;

public class program91_primeNumb_betwwen_1to100 {
	
	public static void main(String[] args) {
		
		
		
		for (int i = 2; i <=50; i++)
		{
			int count=0;
			
			for (int j = 2; j <=i-1; j++) 
			{
				if (i % j==0) 
				{
					count=count+1;
				}
				
			}
			if (count==0)
			{
				System.out.println(i);
				
			}
		
		}
	}

}
