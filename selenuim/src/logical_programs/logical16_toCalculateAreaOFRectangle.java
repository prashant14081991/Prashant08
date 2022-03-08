package logical_programs;

import java.util.Scanner;

public class logical16_toCalculateAreaOFRectangle
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int width = scan.nextInt();
	int height = scan.nextInt();
	
	float radius=scan.nextInt();
	
	System.out.println("area of rectangle:"+ width *height);
	
	System.out.println("area of sphere:"+ (4.0/3.0)* 3.14*(radius*radius*radius));
}
}
