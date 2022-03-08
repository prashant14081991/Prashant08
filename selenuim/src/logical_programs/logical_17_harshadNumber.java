package logical_programs;

import java.util.Scanner;

public class logical_17_harshadNumber {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum=0;
		
		for (int i = num; i > 0; i=i/10) 
		{
			int rem = i % 10;
			
			sum= sum + rem;
		}
		
		System.out.println(sum);
		
		if (num % sum ==0) 
		{
			System.out.println("given number is harshad number");
		}
		
		else {
			System.out.println("given number is not harshad number");
		}
	}

}
