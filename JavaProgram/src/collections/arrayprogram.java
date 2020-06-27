package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayprogram {
	
	public static void main(String[] args) {
		
		employee e1 = new employee(25, "Rachana");
		employee e2 = new employee(26, "Ajay");
		employee e3 = new employee(2, "Aadya"); 
		
		ArrayList<employee> arl =new  ArrayList<employee>();
		arl.add(e1);
		arl.add(e2);
		arl.add(e3);
		
		Iterator<employee> it = arl.iterator();

		while (it.hasNext())
		{
			employee emp = it.next();
			System.out.println("***** "+emp.age);
			System.out.println("***** "+emp.name);
		}
		
		System.out.println("*****  ******************");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("test");
		ar.add("Qa");
		ar.add("Dev");
		ar.add("Selenium");
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("VB");
		ar1.add("C#");
		ar1.add("Python");
		
		ar.addAll(ar1);
		
		for ( int i = 0; i<ar.size();i++ )
		{
			System.out.println("***** "+ar.get(i));
		}
		
		System.out.println("*****  ******************");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("Qa");
		ar2.add("Dev");
		ar2.add("Selenium");
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Java");
		ar3.add("VB");
		ar3.add("C#");
		ar3.add("Python");
	
		
		//ar2.retainAll(ar3);
		
		System.out.println("*****  ******************");
		ar2.removeAll(ar3);
		
		for ( int i = 0; i<ar2.size();i++ )
		{
			System.out.println("***** "+ar2.get(i));
		}
		
	}



}
