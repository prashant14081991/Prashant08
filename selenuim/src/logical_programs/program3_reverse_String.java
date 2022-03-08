package logical_programs;

public class program3_reverse_String {
	
	public static void main(String[] args) {
		
		String mdm="munnamendhe";
		String rev="";
		
		for (int i =mdm.length()-1; i>=0; i--) {
			
			rev= rev + mdm.charAt(i);
		}
		
		System.out.println(rev);
	}

}
