package logical_programs;

public class logical22_toCountPunctuationInAString {
	
	public static void main(String[] args) {
		
		String str="my name is munna. And you? ohh ! 'A' is better than, C/D.";
		
		int countPunctu = 0;
		
		for (int i = 0; i <= str.length()-1; i++)
		{
			if (str.charAt(i)=='.' || str.charAt(i)=='!' || str.charAt(i)=='?' || str.charAt(i)==',' || str.charAt(i)=='/') 
			{
				countPunctu=countPunctu+1;
			}
		}
		System.out.println("total number of punctuation:"+ countPunctu);
	}

}
