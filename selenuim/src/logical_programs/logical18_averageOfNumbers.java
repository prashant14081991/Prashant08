package logical_programs;

import java.util.Scanner;

import org.apache.commons.collections4.functors.WhileClosure;

public class logical18_averageOfNumbers 
{
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int num = scan.nextInt();
	
	float entnum=0;
	//float avg=0;
	float sum=0;
	int count=1;
	
	while( count <=num)
	{
		System.out.println("enetr the value"+ count);
		
		entnum= scan.nextInt();
		sum =sum + entnum;
		count++;
		
	}
	
	float avg = sum/num;
	System.out.println("avgerage:"+avg);
}
}