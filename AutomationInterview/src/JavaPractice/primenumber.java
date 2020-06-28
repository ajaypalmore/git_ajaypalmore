package JavaPractice;

public class primenumber {
	
	public static boolean isPrime (int iNum)
	{
		if (iNum<=1)
		{
			return false;
		}
		for (int i=2; i<iNum; i++)
		{
			if (iNum%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static  void getPrimeNumber(int iNum)
	{
		for (int i=2;i<=iNum;i++)
		{
			if (isPrime(i))
			System.out.print(" "+ i);
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 is Prime Number :::>> " +isPrime(2));
		System.out.println("3 is Prime Number :::>> " +isPrime(3));
		System.out.println("1 is Prime Number :::>> " +isPrime(1));
		System.out.println("0 is Prime Number :::>> " +isPrime(0));
		getPrimeNumber(50);
	}

}
