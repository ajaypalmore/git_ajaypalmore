package mytestProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WhatFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Occurrences";
		WhatFix wbf = new WhatFix();
		System.out.println(wbf.getCharCount(str));
		
	}
	
	public String getCharCount(String str)
	{
		char[] chr = str.toCharArray();
		Map<String , Integer> map  = new LinkedHashMap<String , Integer>();
		for (char c : chr)
		{
			Integer val = map.get(String.valueOf(c));
			if(map.containsKey(String.valueOf(c)))
			{
				map.put(String.valueOf(c), val+1);
			}
			else
			{
				map.put(String.valueOf(c), 1);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(Entry<String, Integer> entry : map.entrySet())
		{
			sb.append(entry.getKey()).append(entry.getValue());
		}
		
		return sb.toString();
		
	}

}
