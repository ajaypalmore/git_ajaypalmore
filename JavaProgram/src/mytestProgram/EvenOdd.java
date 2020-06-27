package mytestProgram;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Evenlst = new ArrayList<Integer>();
		List<Integer> Oddlst = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			if (i%2==0)
			{
				Evenlst.add(i);
			}
			else
			{
				Oddlst.add(i);
			}
		}
		
			System.out.println(Evenlst.addAll(Oddlst));	
			
			for(int i =0;i<Evenlst.size();i++)
			{
				System.out.println(Evenlst.get(i));
			}


	}

}
