package mytestProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		
		int num[] = {2,3,7,9,6,0,9,3};
		int size = num.length;
		for (int i= 0;i<size;i++)
		{
			for (int j= i+1;j<size;j++)
			{
				if (num[i]==num[j])
				{
					System.out.print(num[i] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<*******************************>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		/*int arr1[] = {2, 3, 7, 9, 6, 9, 3};
		int len1 = arr1.length;
		int count[] = new int[len1];
	
		 for (int i = 0; i < size; i++) 
	        {
	            if (count[arr1[i]] == 1)
	                System.out.print(arr1[i] + " ");
	            else
	                count[arr1[i]]++;
	        }
		
		*/
		int arr[] = {2,	3, 7, 9, 6, 9, 3};
		int len = arr.length;
		Set<Integer> hset = new HashSet<Integer>();
		
		for(int k =0; k<len;k++)
		{
			if (hset.contains(arr[k])==true)
				{
					System.out.print(arr[k] + " ");
	
				}
			else
			{
				hset.add(arr[k]);
			}

		}
		
}
}
