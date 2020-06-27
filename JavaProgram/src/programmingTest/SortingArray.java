package programmingTest;

public class SortingArray {

	public static void main(String[] args) {
		int numArr[] = {23,34,56,12,67,76,87,14};
		
		int len = numArr.length;
		int temp;
		
		for (int i =0;i<len;i++)
		{
			for (int j=i+1;j<len;j++)
			{
				if (numArr[i]>numArr[j])
				{
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		System.out.println(" Sorting Order:::::::");
		
		for (int i =0 ; i<len-1 ; i++)
		{
			System.out.print( numArr[i]+" , ");
		}

		System.out.print( numArr[len-1]);
	}

}
