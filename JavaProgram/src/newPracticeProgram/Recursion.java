package newPracticeProgram;

public class Recursion {

	public static void main(String[] args) {
	
		String str = "Welcome";
		String rev = recursion(str);
		System.out.println(rev);
		

	}
	public static String recursion(String s)
	{
		if (s.isEmpty())
		{
			return s;
		}
		
		return recursion(s.substring(1))+s.charAt(0);
	}

}
