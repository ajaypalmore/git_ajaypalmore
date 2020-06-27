package mytestProgram;

import java.util.ArrayList;
import java.util.List;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> res = getOddNumber(1,100);
		for (int i=0; i<res.size();i++)
		{
			System.out.println("::::::::::::::::::"+ res.get(i));
		}
	}
	
	public static List<Integer> getOddNumber(int start,int end)
	{  List<Integer> odd = new ArrayList<Integer>();
		int temp= 0;
		for (int i = start; i<=end;i++)
		{
			temp =i%2;
			if (temp!=0)
			{
				odd.add(i);
			
			}
		}
		 return odd;
	}

}
