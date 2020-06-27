package programmingTest;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Java","Python","JavaScript","C++","C","C#","Java"};
		// o(nxn)
		for(int i= 0;i<names.length;i++){
			for(int j =i+1;j<names.length;j++){
				if (names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element:::: " + names[i]);
				}
				
			}
		}
		
		System.out.println(":::::::::::::::::::::::");
		//2. Hashset== Store unique value
		Set<String> store = new HashSet<String>();
		for (String name : names)
		{
			if(store.add(name) == false)
			{
				System.out.println("Duplicate Element:::: " + name);
			}
		}
		System.out.println(":::::::::::::::::::::::");
		//3. Using Hashmap
		Map<String,Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names)
		{
			Integer count = storeMap.get(name);
			if (count==null)
			{
				storeMap.put(name, 1);
			}else
			{
				
				storeMap.put(name, ++count);
				
			}
		}
		
		Set<Entry<String, Integer>> enteySet = storeMap.entrySet();
		for (Entry<String,Integer> entry : enteySet)
		{
			if ((entry.getValue()>1))
			{
				System.out.println("Duplicate Element:::: " + entry.getKey());
			}
		}
		
	}

}
