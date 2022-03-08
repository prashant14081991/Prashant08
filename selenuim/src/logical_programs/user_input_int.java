package logical_programs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class user_input_int {
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	System.out.println(num1+num2);
	System.out.println(num1*num2);
}
}