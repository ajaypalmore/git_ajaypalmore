package mytestProgram;

import java.util.Arrays;

public class Anagram_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Cat";
		String str2 = "Actt";
		
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		boolean status = true;
		 
		if(str1.length()!=str2.length())
		{
			System.out.println("String is not for anagram");
		}
		else
		{
			char [] chr1 = str1.toLowerCase().toCharArray();		
			char [] chr2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			status = Arrays.equals(chr1, chr2);
			
			
			if (status)
			{
				System.out.println("String is Anagram");
			}
			else
			{
				System.out.println("String is not Anagram");
			}
		}
		
		
		
	}

}
