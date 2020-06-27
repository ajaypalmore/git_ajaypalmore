package programmingTest;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {-1,0,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int sum1 = 0;
		for(int i=0 ;i<num.length;i++)	
		{
			sum = sum+num[i];
		}
		
		System.out.println("Sum:::"+sum);
		
		for(int j=-1 ;j<=10;j++)	
		{
			sum1 = sum1+j;	
		}
		
		System.out.println("Sum1:::"+sum1);
		
		System.out.println("Missing Number ::: "+(sum1-sum));
		
	}

}
