package mytestProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DublicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Java", "Python", "JavaScript", "C++", "C", "C#", "Java" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++)
				if (names[i].equals(names[j])) {
					System.out.println("<<<<<Duplicate String>>>>> " + names[i]);
				}
			
		}
		
		Set<String> store = new HashSet<String>();

		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("<<<<<Duplicate String>>>>> " + name);
			}
		}

		Map<String, Integer> mapStore = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = mapStore.get(name);
			if (count == null) {
				mapStore.put(name, 1);
			} else {
				mapStore.put(name, ++count);
			}
		}
		Set<Entry<String, Integer>> entryset = mapStore.entrySet();
		for(Entry<String, Integer> entry: entryset )
		{
			if (entry.getValue()>1)
			{
				System.out.println("::::::::::::::::::::::"+entry.getValue()+"::::::::::::::::::"+entry.getKey());
			}
		
		}
	}
}
