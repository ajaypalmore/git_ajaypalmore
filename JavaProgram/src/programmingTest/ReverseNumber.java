package programmingTest;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		int num1 = 123456789;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
