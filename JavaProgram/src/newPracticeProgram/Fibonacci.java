package newPracticeProgram;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int c;
		int a=0,b=1;

		for (int i = 1;i<=num;i++ )
		{
			 c = a + b;
	            a = b;
	            b = c;
	            System.out.print(b+" ");
		}
	}

}
