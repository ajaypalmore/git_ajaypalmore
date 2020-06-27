package mytestProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class shiftleft {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {3,4,0,7,8,6,0,0,9,8,2,1};
		LinkedList<Integer> left = new LinkedList<Integer>();
		
		int len = num.length;
		int temp;
		for(int i =0 ;i<len;i++)
		{
					left.add(num[i]);
					
			
			
			
		}
		//System.out.println(left.addAll(right));
		Collections.sort(left);
		
		for (int i = 0;i<left.size();i++)
		{
			System.out.println(left.get(i));
		}
	}

}
