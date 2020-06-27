package programmingTest;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {-20,-88,43,56,76,78,3434,546467,-9498};
		int largest =num[0];
		int smallest = num[0];
		
		for (int i= 1;i<num.length;i++)
		{
			if (num[i]>largest)
			{
				largest=num[i];
			}else if (num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		
		System.out.println("::::::::smallest:::::::::::::"+smallest);
		System.out.println("::::::::largest::::::::::::::"+largest);
	}

}
