package mytestProgram;

public class OddEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {8,45,6,829,821,567};
		int temp=0;
		for (int i = 0 ; i<num.length;i++)
		{
			temp = num[i]%2;
			if (temp==0)
			{
				System.out.println("Even Number::::::"+ num[i]);
			}
			else
			{
				System.out.println("ODD Number::::::"+ num[i]);
			}
		}
	}
}
