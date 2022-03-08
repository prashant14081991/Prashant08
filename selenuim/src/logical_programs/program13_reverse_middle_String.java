package logical_programs;

public class program13_reverse_middle_String
{
public static void main(String[] args) {
	 
	String mdm= "munna sachin ravi sarita sangita";
	String ar[]=mdm.split(" ");
	
	for (int i = 0; i <= ar.length-1; i++) 
	{
		if (i==1)  //i%2==0
		{
			String str = ar[i];
			ar[i]=reverseString(str);
		}
	}
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.print(ar[i] +" ");
		}
	
}
public static String reverseString (String inp) 
{
	String rev="";
	for (int i=inp.length()-1; i >=0 ;i--) 
	{
		rev = rev + inp.charAt(i);
	}
	return rev;
}
	
}
