package newPracticeProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 100;
		
		String primenumber = ""; 	
		
		for (int i = 1; i<=num;i++)
		{ 
			int counter=0;
			
			for(int j =i;j>=1;j--)
			{
				if(i%j==0)
				{
					counter=counter+1;
				}
			}
			if (counter == 2)
			{
				primenumber = primenumber + i + " ";
			}
		}
		
		 System.out.println("Prime numbers from 1 to 100 are :");
	     System.out.println(primenumber);

	}

}
