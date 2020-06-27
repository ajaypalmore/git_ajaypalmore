package mytestProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindNumberOfOccuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "jkfdhgjksdgzxvskvertiadueriocxzmvbuwqoirudfsznvlcxvnbkofghonxasfyusfnjkfgjcvkjdhfkjshkdfkkcvjxkjcbvx";
		
		Map<Character,Integer> chmap = new HashMap<Character,Integer>();
		int len = str.length();
		
		for (int i = 0;i<len;i++)
		{
			if(chmap.containsKey(str.charAt(i))==false)
			{
				chmap.put(str.charAt(i), 1);
			}
			else
			{
				int cnt = chmap.get(str.charAt(i));
				chmap.put(str.charAt(i), ++cnt);
			}
		}

		Set<Map.Entry<Character,Integer>> entryset = chmap.entrySet();
		for(Map.Entry<Character,Integer> entry : entryset)
		{
			if (entry.getValue()>1)
			{
				System.out.println("Word::: "+entry.getKey()+"  :::::::  "+entry.getValue());
			}
		}
	}

}
