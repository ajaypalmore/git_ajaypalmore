package newPracticeProgram;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {
		
		List lst = new ArrayList();
		
		lst.add(23);
		lst.add("sdjfh");
		lst.add('A');
		lst.add(23.04);
		lst.add(true);
		
		for(int i = 0;i<lst.size();i++)
		{
			System.out.println("<<<<<<>>>>>>  "+lst.get(i));
		}
		
		System.out.println("<<<<<<>>>>>>***************************<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
		List<String> lst1 = new ArrayList<String>();
		
		lst1.add("Java");
		lst1.add("C#");
		lst1.add("C++");
		lst1.add("VB.net");
		lst1.add("C");
		
		for(int i = 0;i<lst1.size();i++)
		{
			System.out.println("<<<<<<>>>>>>  "+lst1.get(i));
		}
		System.out.println("<<<<<<>>>>>>***************************<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>");
		for(String str:lst1 )
		{
			System.out.println("<<<<<<>>>>>>  "+str);
		}
	}

}
