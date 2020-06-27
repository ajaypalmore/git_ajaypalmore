package mytestProgram;

import java.util.ArrayList;
import java.util.List;

public class Listoddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] odd = getOddNumber(3,117);
		 for (int i =0; i<odd.length;i++)
		 {
			 System.out.println(odd[i]);
		 }
			 
			
		
	}

	 static int [] getOddNumber(int start,int end)
		{  int temp = 0;
		int arr[] = new int [((end-start)/2)+1];
		int count = 0;
			for (int i = start; i<end;i++)
			{
				temp =i%2;
				if (temp!=0)
				{
					
					arr[count]=i;
					count++;
			
				}
			}
			
			 return arr ;
		}
	
	
}
