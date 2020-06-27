package mytestProgram;

import java.util.TreeSet;

public class MaximumTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iarry[] = {30,45,565,65,23,54,33};
		int Max1 = 0;
		int Max2 = 0;
		
		for (int i=0;i<iarry.length;i++)
		{
			if( Max1<iarry[i])
			{	Max2 = Max1;
				Max1  = iarry[i];
				
			}else if (Max2<iarry[i])
			{
				Max2 = iarry[i];
				
			}
		}
			
		System.out.println("Max 1 :::" + Max1);
		System.out.println("Max 2 :::" + Max2);
		
		
	TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j=0;j<iarry.length;j++)
		{
			ts.add(iarry[j]);
		}
		
		System.out.println("First Smallest number ::::: "+ts.last());
		ts.remove(ts.last());
		System.out.println("Second Smallest number ::::: "+ts.last());

	}

}
