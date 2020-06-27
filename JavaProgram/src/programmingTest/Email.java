package programmingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String strEmail = sc.next();
		Map<String, List<String>> data = new HashMap<String, List<String>>();;
		
		while (strEmail!=null && !strEmail.toUpperCase().equals("END") )
		{
		
			add(strEmail,data);
			strEmail = sc.next();
		}
		
		
		for (Entry<String, List<String>> entry : data.entrySet()) {
	       
	            System.out.println("DomainName:: "+entry.getKey()+" || "+" Name >>"+ entry.getValue());
	        }
	       
		
		
	}

	public static void add (String str, Map<String, List<String>> data )
	{
		
		String[] test = str.split("@");
		String username = test[0];
		String domainname = test[1];
		
		if (data.get(domainname) != null)
		{
			data.get(domainname).add(username);
			
		}
		else
		{
			ArrayList<String> list = new ArrayList<String>();
			list.add(username);
		    data.put(domainname, list);
		}
		}
	}

