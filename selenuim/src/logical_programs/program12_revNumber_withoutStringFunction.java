package logical_programs;

public class program12_revNumber_withoutStringFunction 
{
public static void main(String[] args) {
	
	int orgnum= 15264859;
	
	int revNum=0;
	
	for (int i = orgnum; i > 0; i=i/10)
	{
		int rem= i % 10;
		
		revNum= revNum * 10 + rem ;
	}
	
	System.out.println(revNum);
}
}
