package JavaPractice;

public class palindrome {

// Check the Palindrome number and string
	public static void isPalindromeNumber(int num) {
	System.out.println("Given Number is :  "+num);
		int r = 0;
		int sum = 0;
		int t = num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if (t==sum) {
			System.out.println("This number is Palindrome");
		}else {
			System.out.println("This number is not Palindrome");
		}
		
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void isisPalindromeString(String str)
	{
		System.out.println("Given String is  "+str);
		StringBuffer sb = new StringBuffer(str);
		String  rev = sb.toString();
		
		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindromeNumber(454);
		isPalindromeNumber(458);
		isisPalindromeString("madam");
		isisPalindromeString("raja");
	}

}
