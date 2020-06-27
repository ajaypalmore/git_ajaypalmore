package mytestProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class Smallest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {349,56,45,-8,34,678,89,898,4,2};
		int first,second;
		
		first = second= Integer.MAX_VALUE;
		int len = num.length;
		if (len<2)
		{
			System.out.println("Only 2 Number in list");
		}
		else 
		{
			for (int i=0;i<len;i++)
			{
				if (first>num[i])
				{
					second = first;
					first =num[i];
					
				}
				else if (second > num[i])
				{
					second = num[i];
				}
			}
			
			System.out.println("First Smallest number ::::: "+first);
			System.out.println("Second Smallest number ::::: "+second);
		}
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j=0;j<len;j++)
		{
			ts.add(num[j]);
		}
		
		System.out.println("First Smallest number ::::: "+ts.first());
		System.out.println("Second Smallest number ::::: "+ts.higher(1));
		
	}

}
