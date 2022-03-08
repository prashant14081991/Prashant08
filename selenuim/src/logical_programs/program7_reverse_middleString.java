package logical_programs;

import java.util.Scanner;

public class program7_reverse_middleString 
{
	public static void main(String[] args) 
	{  //abcde

		String str = "abc xyz abc1 xyz1"; // cba xyz 1cba xyz1

		String[] ar = str.split(" "); // [abc xyz abc1 xyz1]

		                  //3
		for (int i = 0; i <= ar.length - 1; i++) 
		{
			//if(i==2 || i==3)		  
			if (i % 2 == 0)
			{
				String s1 = ar[i];  // abc1
				ar[i] = reverseString(s1);   //re initialization of string info for even index
			
			}

		}
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

	public static String reverseString(String inp) {
		String rev = "";
		for (int i = inp.length() - 1; i >= 0; i--) {
			rev = rev + inp.charAt(i);
		}
		return rev;
	
}
}