package newPracticeProgram;

public class factoricalWithoutRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int fact= 1;
		int num = 5;
		for (i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial:::>> "+fact);
	}

}
