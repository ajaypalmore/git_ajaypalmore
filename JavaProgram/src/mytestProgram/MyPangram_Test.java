package mytestProgram;

import java.util.HashSet;
import java.util.Set;

public class MyPangram_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"The quick brown fox jumps over the lazy dog","The quick brown fox 5jumps over the lazy dog","We promptly judged antique ivory buckles for the next prize","We promptly judged antique ivory buckles for the next prie"};
		String count="";
		String pangram = "";
		Set<Character> Schr = new HashSet<Character>();
		
		for(int i=0;i<str.length;i++)
		{
			pangram = str[i].toLowerCase().replaceAll("\\s", "");
			char [] chr = pangram.toCharArray();
			for(char ch : chr)
			{
				Schr.add(ch);
			}
			System.out.println("Total char for :: "+ Schr.size());
			if (Schr.size()==26)
			{
				count = count +"1";
					
			}
			else
			{
				count = count+"0";
			}
			pangram = "";
			Schr.removeAll(Schr);
			
		}
		
		System.out.println(count);
		
		
		
	}

}
