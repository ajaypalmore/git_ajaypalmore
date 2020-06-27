package newPracticeProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 3435345;
		int rev=0;
		System.out.println("Before reverse "+num);
		while(num!=0)
		{
			rev = (rev*10)+num%10;
			num = num/10;
		}
		
		System.out.println("After reverse "+rev);
		
	
		String str = "madam";
		String rStr ="";
		int len = str.length();
		System.out.println("Before reverse "+str);
		for (int i=len-1;i>=0;i--)
		{
			rStr = rStr+str.charAt(i);
		}
		System.out.println("After reverse "+rStr);
		
		if (str.equals(rStr))
		{
			System.out.println(str+" : Equal : "+rStr);
		}
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String Buffer Reverse  "+sb.reverse());
		
		StringBuilder sbr = new StringBuilder(str);
		System.out.println("String Buffer Reverse  "+sbr.reverse());

	

	int count = 0;
	for (char c : str.toCharArray()) {
	    count++;
	}
	System.out.println("Str length: " + count);
}
}
