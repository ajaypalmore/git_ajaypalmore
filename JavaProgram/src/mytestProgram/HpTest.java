package mytestProgram;

import java.util.regex.Pattern;

public class HpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\s");
		String str = "Ajay, is a Selenium Engineer";
		String temp[] = str.split(" "); //pattern.split(str);
		
		String output = "";
		String result = "";
		
		for (int i = temp.length-1; i>=0;i--)
		{
			if (temp[i].contains(",")==true)
			{
				String co = temp[i].replace(",", "");
				output = output.trim()+", "+co;
			}
			else if (temp[i].contains(",")==false)
			{
				output = output+temp[i]+" ";
			}
		}
		System.out.println(output);
		
		/*
		 for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1)
	                result = temp[i] + result;
	            else
	                result = " " + temp[i] + result;
	        }
		
		 System.out.println(result);*/
	}

}
