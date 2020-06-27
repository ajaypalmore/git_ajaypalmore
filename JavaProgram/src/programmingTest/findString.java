package programmingTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class findString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var = "abcdefxyzabcerjabcjzfkabc";
		var = var.replace("abc", "A");
		String str1[] = var.split("A");
		int len = str1.length;
		System.out.println("Repeated char seq number :  " + len);
		
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		
		char[] chrs = var.toCharArray();
		
		for(Character ch : chrs)
		{
			
			
			if (charMap.containsKey(ch))
			{
				//int cnt = charMap.get(ch);
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
			
		}
		
		Set<Character> keys = charMap.keySet();
		for(Character ch1 : keys)
		{
			if(charMap.containsKey(ch1))
			{
				System.out.println(ch1    +" :: Duplicate Char ::  "+charMap.get(ch1));
			}
		}
	
		}

}
