package logical_programs;

import java.util.Scanner;

public class program9_prime_number {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		//int num=13;
		int count=0;
		
		for (int i = 2; i < num; i++) 
		{
			if (num % i==0)
			{
				count=count+1;
				break;
			}	
		}
		if (count==1) 
		{
			System.out.println("given number is not prime number");
		} 
		else 
		{
			System.out.println("given number is prime number");
		}
	}

}
