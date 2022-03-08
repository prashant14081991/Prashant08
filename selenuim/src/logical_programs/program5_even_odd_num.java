package logical_programs;

import java.util.Scanner;

public class program5_even_odd_num {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int entNum = scan.nextInt();
		
		if (entNum % 2==0) {
			
			System.out.println("given number is even");
			
		} 
		else {
			System.out.println("given number is odd");
		}
	}

}
