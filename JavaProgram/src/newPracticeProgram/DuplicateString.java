package newPracticeProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Java", "Python", "JavaScript", "C++", "C", "C#", "Java", "Java"};
		int len = names.length;
		
		for (int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			if (names[i].equals(names[j]))
			{
				System.out.println("<<<<<<<<Duplicate>>>>>>>>>>  " +names[i]);
			}
		}
		
		Set<String> word = new HashSet<String>();
		for(int i=0;i<len;i++)
		{
			if(word.add(names[i])==true)
			{
				word.add(names[i]);
			}else
			{
				System.out.println("<<<<<<<<Duplicate Hash>>>>>>>>>>  " +names[i]);
			}
		}
		Set<String> word1 = new HashSet<String>();
		
		for(String name : names)
		{
			if(word1.add(name)==false)
			{
				System.out.println("<<<<<<<<Duplicate Hash>>>>>>>>>>  " +name);
			}
		}
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String name : names)
		{
			Integer i = map.get(name);
			if (map.containsKey(name))
			{
				map.put(name, i+1);
			}
			else
			{
				map.put(name, 1);
			}
		}
		
		for(Entry<String,Integer> entry: map.entrySet() )
		{
			System.out.println("Key :: "+entry.getKey()+"  Value :: "+entry.getValue());
		}
		
	}
}
