package mytestProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindNumberOfOccuration_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num []= {43,34,56,657,67,8,87,87,54,78,34,42,45,45,45,45,45,45};
		
		Map<Integer,Integer> nummap = new HashMap<Integer,Integer>();
		int len = num.length;
		
		for (int i = 0;i<len;i++)
		{
			if(nummap.containsKey(num[i])==false)
			{
				nummap.put(num[i], 1);
			}
			else
			{
				int cnt = nummap.get(num[i]);
				nummap.put(num[i], ++cnt);
			}
		}

		Set<Map.Entry<Integer,Integer>> entryset = nummap.entrySet();
		for(Map.Entry<Integer,Integer> entry : entryset)
		{
			if (entry.getValue()>1)
			{
				System.out.println("Number::: "+entry.getKey()+"  :::::::  "+entry.getValue());
			}
		}
	}

}
