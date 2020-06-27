package newPracticeProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		
		Set<String> setStr = new HashSet<String>();
		setStr.add("Ajay");
		setStr.add("Anup");
		setStr.add("Aadya");
		setStr.add("Rachana");
		setStr.add("Rashmi");
		
		//Print without Iterator
		for (String str : setStr)
		{
			System.out.println("Set WithOut Iterator   "+str);
		}
		
		//Print with Iterator
		Iterator<String> it = setStr.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Testing for iterator   "+it.next());
		}
	}

}
