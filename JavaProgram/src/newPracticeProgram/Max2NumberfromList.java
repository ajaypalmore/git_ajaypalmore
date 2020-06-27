package newPracticeProgram;

public class Max2NumberfromList {
	
	public static void main(String[] args) {
	
	int num[] = {23,45,45,67,78,23,89};
	int len = num.length;
	int max1=num[0],max2=num[0];

	for(int i=0;i<len;i++)
	{
		if(max1<num[i])
		{
			max2=max1;
			max1=num[i];
		}
		else if(max2<num[i])
		{
			max2=num[i];
		}
	}
		
	System.out.println("MAX1: " +max1);
	System.out.println("MAX2: " +max2);
}
}
